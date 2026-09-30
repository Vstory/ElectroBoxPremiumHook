#!/usr/bin/env python3
"""Generate ChinesePatch.java with comprehensive translations"""
import re

# Read all strings
strings = {}
with open('/workspace/ElectroBoxPremiumHook/all_strings.txt') as f:
    for line in f:
        parts = line.strip().split('\t', 1)
        if len(parts) == 2:
            strings[parts[0]] = parts[1]

# Translation dictionary: English -> Chinese
# Format: exact English text -> Chinese translation
T = {
    # ===== App =====
    "ElectroBox - Electronics": "ElectroBox - 电子工具箱",
    
    # ===== Bottom Nav =====
    "Home": "主页", "Catalog": "目录", "Apps": "应用", "Settings": "设置",
    
    # ===== Common UI =====
    "Search": "搜索", "Cancel": "取消", "Apply": "应用", "Agree": "同意",
    "Close": "关闭", "Done": "完成", "Done with editing list": "完成编辑列表",
    "Done indicator": "完成指示器", "Reset": "重置", "Next": "下一步",
    "Back": "返回", "Backspace": "退格", "Share": "分享", "Delete": "删除",
    "Save": "保存", "Edit": "编辑", "Edit list": "编辑列表",
    "Yes": "是", "No": "否", "OK": "确定", "Loading": "加载中",
    "No results": "无结果", "Copied": "已复制", "Clear": "清除",
    "Select": "选择", "None": "无", "Default": "默认", "Custom": "自定义",
    "On": "开", "OFF": "关", "ON": "开",
    "ALL": "全部", "PRO": "高级", "Free": "免费", "New": "新",
    "Rate": "评分", "Rate Us": "给我们评分",
    "Rating 5 stars will support us!": "给我们五星评分将是最大的支持！",
    "See All": "查看全部", "Quick Access": "快速访问",
    "Add to favourites": "添加到收藏",
    "Favourites are empty.": "收藏夹为空。",
    "Favourites": "收藏",
    "Working On": "正在开发",
    "Completed": "已完成", "In Progress": "进行中",
    "In progress indication": "进行中指示",
    "Download": "下载", "Navigate back": "返回",
    "Navigate up": "转到上一层级",
    "Description": "描述", "Education": "教育",
    "Information": "信息", "Error": "错误", "Warning": "警告",
    "Drag button": "拖拽按钮", "Tab": "标签页",
    "Items": "项目", "Name": "名称",
    "Interfaces": "接口", "Interfaces using this port": "使用此端口的接口",
    "Interfaces": "接口",
    
    # ===== Quick Settings =====
    "Quick Settings": "快捷设置",
    "Dark Mode": "深色模式", "Keep Screen On": "保持屏幕常亮",
    "Language": "语言",
    
    # ===== Calculator =====
    "Calculate": "计算", "Calculate Input": "计算输入", "Calculate Output": "计算输出",
    "Result": "结果", "Add More": "添加更多",
    "Calculators": "计算器", "Calculators section is new!": "计算器板块是新功能！",
    "Reset": "重置",
    
    # ===== Calculator Titles =====
    "Analog to Digital": "模数转换",
    "Sine Voltage": "正弦电压",
    "Voltage Divider": "分压器",
    "Resistors Connecting": "电阻连接",
    "Capacitors Connecting": "电容器连接",
    "Inductors Connecting": "电感器连接",
    "Inductor Colors": "电感色环",
    "Wave Parameters": "波形参数",
    "Battery Life": "电池寿命",
    "Resistor Colors": "电阻色环",
    "Non-standard resistor": "非标准电阻",
    
    # ===== Calculator Labels =====
    "Voltage": "电压", "Supply Voltage": "供电电压", "Output Voltage": "输出电压",
    "Input Voltage": "输入电压", "Average Voltage": "平均电压",
    "Peak Voltage": "峰值电压", "Peak to Peek Voltage": "峰峰电压",
    "Provided Voltage": "供电电压",
    "ADC Value": "ADC 值", "ADC Voltage": "ADC 电压",
    "IO Voltage": "IO 电压", "IO Current": "IO 电流",
    "IO": "IO",
    "High Reference Voltage": "高参考电压", "Low Reference Voltage": "低参考电压",
    "Current": "电流", "Resistance": "电阻", "Capacitance": "电容",
    "Inductance": "电感", "Frequency": "频率",
    "Power": "功率", "Energy": "能量",
    "Resistor 1": "电阻 1", "Resistor 2": "电阻 2",
    "Battery Capacity": "电池容量", "Battery Powered": "电池供电",
    "Average Consumption": "平均功耗",
    "Idle Time": "空闲时间", "Idle Current": "空闲电流",
    "Serial Connection": "串联连接", "Parallel Connection": "并联连接",
    "Input": "输入", "Input Value": "输入值", "Input Range": "输入范围",
    "Input Frequency": "输入频率", "Input Period": "输入周期",
    "Input Wavelength": "输入波长",
    "Maximum": "最大值", "Minimum": "最小值", "Minus": "减",
    "Length": "长度", "Dimensions": "尺寸",
    "Digital Pins": "数字引脚", "Analog Input Pins": "模拟输入引脚",
    "Analog Output Pins": "模拟输出引脚",
    "Digital": "数字", "Analog": "模拟", "Data": "数据",
    "Audio": "音频", "Flash": "闪光灯",
    
    # ===== Calculator Descriptions =====
    "Calculate ADC Value": "计算 ADC 值",
    "Calculate ADC Voltage": "计算 ADC 电压",
    "Calculate Current": "计算电流",
    "Calculate Voltage": "计算电压",
    "Calculate Resistance": "计算电阻",
    "Calculate Resistor 1": "计算电阻 1",
    "Calculate Resistor 2": "计算电阻 2",
    "Calculate Supply Voltage": "计算供电电压",
    "Calculate Output Voltage": "计算输出电压",
    "Errors were encountered while performing calculations.": "计算过程中遇到错误。",
    "The overall usage time should be greater than 0": "总使用时间应大于 0",
    "Find output voltages and values of Analog to Digital Converters. ": "查找模数转换器的输出电压和值。",
    "Find the total capacitance of a circuit with capacitors.": "查找含有电容器的电路的总电容。",
    "Find the total inductance of a circuit with inductors.": "查找含有电感器的电路的总电感。",
    "Find the total resistance of a circuit with resistors.": "查找含有电阻器的电路的总电阻。",
    "Calculate the approximate life of a battery based on its capacitance and usage.": "根据电池容量和使用情况计算电池的大致使用寿命。",
    "Convert through the different parameters of waves.": "通过波形的不同参数进行转换。",
    "Convert through RMS, Peek Voltage and Peek to Peek Voltage used in sine waves.": "通过正弦波中的RMS、峰值电压和峰峰电压进行转换。",
    "Easily find the values of the resistors by their band colors.": "通过色环颜色轻松查找电阻值。",
    "Easily find the values of the inductors by their band colors.": "通过色环颜色轻松查找电感值。",
    "It is used to get output voltage as a fraction of the input voltage.": "用于获取输出电压作为输入电压的一部分。",
    "We are currently working on adding MORE THAN 30 NEW FREE CALCULATORS which will be available the next month.": "我们目前正在开发超过30个新的免费计算器，将于下个月推出。",
    "These electrical and electronics engineering calculators are here to help you solve complex equations and calculations quickly.": "这些电气和电子工程计算器可帮助您快速解决复杂的方程和计算。",
    
    # ===== Reviews / Downloads =====
    "4128 Reviews": "4128 条评价",
    "500K+ Downloads": "50万+ 次下载",
    "Five start rating": "五星评分", "Four start rating": "四星评分",
    
    # ===== Settings / Premium =====
    "Ads Advanced Settings": "广告高级设置",
    "Contact Us": "联系我们",
    "Get Premium Features": "获取高级功能",
    "Lifetime License": "终身许可证",
    "go_premium_details_text": "通过此一次性购买，您可以解锁所有高级功能并移除广告。许可证可用于您Google帐户的所有设备。",
    "error_loading_prices": "请连接互联网。",
    "error_purchasing": "购买出错",
    "Description": "描述",
    
    # ===== Errors =====
    "Describe where is the error": "描述错误位置",
    "Please connect to the internet.": "请连接互联网。",
    "No email application found!": "未找到电子邮件应用！",
    "Is there anything missing that you would like to see in the application? Request it and we will add it.": "应用中缺少您想看到的功能吗？请提出请求，我们会添加。",
    "If you have encountered any errors, you can report them. We usually fix them within a week.": "如果您遇到任何错误，可以报告给我们。我们通常在一周内修复。",
    
    # ===== Language names =====
    "English (English)": "中文 (Chinese)",  # When Chinese locale, show as Chinese
    
    # ===== Component Names =====
    "Boards": "开发板",
    "Single-board microcontrollers and microcontroller kits are equipped with sets of digital and analog input/output (I/O).": "单片机和微控制器套件配备了一组数字和模拟输入/输出（I/O）接口。",
    "Bluetooth": "蓝牙", "Communication": "通信",
    "Debug SWD": "SWD 调试", "CAN": "CAN 总线",
    "All Devices": "所有设备", "Microcontroller": "微控制器",
    "Microcontroller: %1$s": "微控制器：%1$s",
    "Main Processor": "主处理器", "Memory": "存储器", "Memory Cards": "存储卡",
    "EEPROM": "EEPROM", "FPGA": "FPGA", "FLASH": "FLASH",
    "GSM": "GSM", "LTE": "LTE", "Lora": "LoRa", "I2C": "I2C",
    "MIDI": "MIDI", "ISCP": "ISCP", "ISPC USB Interface": "ISPC USB 接口",
    "Infrared": "红外", "Infrared:": "红外：",
    "Microwave": "微波", "Microwave:": "微波：",
    
    # ===== Port Names (keep technical names, translate descriptions) =====
    "ATX Power Supply": "ATX 电源",
    "AT Keyboard": "AT 键盘",
    "Analog Audio": "模拟音频",
    "AV Composite analog": "AV 复合模拟",
    "YPbPr Component Video": "YPbPr 分量视频",
    "CVBS": "CVBS 复合视频",
    "Lightning connector": "Lightning 连接器",
    "Apple lightning connector": "Apple Lightning 连接器",
    "Apple 30-pin dock connector": "Apple 30 针 Dock 连接器",
    "Apple 30-pin dock port": "Apple 30 针 Dock 端口",
    "Car audio ISO": "车载音频 ISO",
    "D-subminiature": "D-sub 连接器",
    "40-Conductor": "40 芯排线",
    "44-Pin": "44 针",
    "Diagnostic connector": "诊断连接器",
    "Edge connector": "边缘连接器",
    "Modular connector": "模块化连接器",
    "ISO Audio Connectors": "ISO 音频连接器",
    "ISO Trailer Connectors": "ISO 拖车连接器",
    "Mirco Ribbon Connector": "微型带状连接器",
    "Military Standard": "军用标准",
    "Molex connector": "Molex 连接器",
    "Mini-DIN": "Mini-DIN",
    "DIN": "DIN",
    "DVI": "DVI",
    "Display Port": "DisplayPort",
    "HDMI": "HDMI",
    "FireWire": "FireWire",
    "JTAG": "JTAG",
    "Mini VGA": "Mini VGA",
    
    # ===== Signal images =====
    "Analog signal image": "模拟信号图片",
    "Digital signal image": "数字信号图片",
    "Audio data image": "音频数据图片",
    "Data transfer image": "数据传输图片",
    "Energy transfer image": "能量传输图片",
    "Chip image": "芯片图片", "Chip text": "芯片文本",
    "Dark mode image": "深色模式图片",
    "Keep screen on image": "保持屏幕常亮图片",
    "Interface image": "接口图片",
    "News image": "新闻图片", "Item image": "项目图片",
    
    # ===== Colors =====
    "Black": "黑色", "Blue": "蓝色", "Brown": "棕色", "Gray": "灰色",
    "Green": "绿色", "Light Gray": "浅灰色", "Purple": "紫色",
    "Tan": "棕褐色", "Teal": "青色", "Violet": "紫罗兰",
    "No Color": "无颜色", "Orange": "橙色", "Pink": "粉色",
    "Red": "红色", "White": "白色", "Yellow": "黄色",
    
    # ===== Resistor bands =====
    "Bands": "色环", "3 Bands": "3 环", "4 Bands": "4 环",
    "5 Bands": "5 环", "6 Bands": "6 环",
    "Capacitor %1$s": "电容器 %1$s",
    "Inductor %1$s": "电感器 %1$s",
    
    # ===== Wavelength ranges =====
    "0.01nm to 10nm": "0.01nm 至 10nm",
    "10nm to 380nm": "10nm 至 380nm",
    "380nm to 750nm": "380nm 至 750nm",
    "750nm to 1mm": "750nm 至 1mm",
    "1mm to 1m": "1mm 至 1m",
    "More than 1m": "超过 1m",
    
    # ===== Misc =====
    "Gamma": "伽马", "Gamma:": "伽马：",
    "from_0_01nm_to_10nm": "0.01nm 至 10nm",
    "from_10nm_to_380nm": "10nm 至 380nm",
    "from_1mm_to_1m": "1mm 至 1m",
    "from_380nm_to_750nm": "380nm 至 750nm",
    "from_750nm_to_1mm": "750nm 至 1mm",
    "more_than_1m": "超过 1m",
    "Logic Circuit Simulator Pro": "逻辑电路模拟器 Pro",
}

# Generate Java file
lines = []
lines.append('package com.hook.electrobox;')
lines.append('')
lines.append('import android.content.res.Resources;')
lines.append('import java.util.HashMap;')
lines.append('import java.util.Locale;')
lines.append('import java.util.Map;')
lines.append('')
lines.append('public class ChinesePatch {')
lines.append('    private static final Map<String, String> ZH = new HashMap<>();')
lines.append('    private static boolean inited = false;')
lines.append('')
lines.append('    private static void init() {')
lines.append('        if (inited) return;')
lines.append('        inited = true;')

for en, zh in sorted(T.items()):
    # Escape Java string
    en_escaped = en.replace('\\', '\\\\').replace('"', '\\"')
    zh_escaped = zh.replace('\\', '\\\\').replace('"', '\\"')
    lines.append(f'        ZH.put("{en_escaped}", "{zh_escaped}");')

lines.append('    }')
lines.append('')
lines.append('    public static boolean isChineseLocale(Resources res) {')
lines.append('        Locale locale;')
lines.append('        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {')
lines.append('            locale = res.getConfiguration().getLocales().get(0);')
lines.append('        } else {')
lines.append('            locale = res.getConfiguration().locale;')
lines.append('        }')
lines.append('        return "zh".equals(locale.getLanguage());')
lines.append('    }')
lines.append('')
lines.append('    public static String getTranslation(String text) {')
lines.append('        if (text == null) return null;')
lines.append('        init();')
lines.append('        return ZH.get(text);')
lines.append('    }')
lines.append('}')

with open('/workspace/ElectroBoxPremiumHook/src/main/java/com/hook/electrobox/ChinesePatch.java', 'w') as f:
    f.write('\n'.join(lines))

print(f'Generated ChinesePatch.java with {len(T)} translations')
