package com.hook.electrobox;

import java.util.HashMap;
import java.util.Map;

public class ChinesePatch {
    private static final Map<String, String> ZH = new HashMap<>();
    private static boolean inited = false;

    private static void init() {
        if (inited) return;
        inited = true;

        // ===== App / Nav =====
        put("Home", "主页");
        put("Catalog", "目录");
        put("Apps", "应用");
        put("Settings", "设置");
        put("Search", "搜索");
        put("Cancel", "取消");
        put("Apply", "应用");
        put("Agree", "同意");
        put("Close", "关闭");
        put("Done", "完成");
        put("Done with editing list", "完成编辑列表");
        put("Reset", "重置");
        put("Next", "下一步");
        put("Back", "返回");
        put("Backspace", "退格");
        put("Share", "分享");
        put("Delete", "删除");
        put("Save", "保存");
        put("Edit", "编辑");
        put("Edit list", "编辑列表");
        put("Yes", "是");
        put("No", "否");
        put("OK", "确定");
        put("Rate", "评分");
        put("Rate Us", "给我们评分");
        put("See All", "查看全部");
        put("See all", "查看全部");
        put("Quick Access", "快速访问");
        put("Add to favourites", "添加到收藏");
        put("Favourites are empty.", "收藏夹为空。");
        put("Favourites", "收藏");
        put("Favorites", "收藏");
        put("Information", "信息");
        put("Completed", "已完成");
        put("Working On", "正在开发");
        put("In Progress", "进行中");
        put("OPEN", "打开");
        put("Open", "打开");
        put("NEW", "新");
        put("New", "新");
        put("PRO", "高级");
        put("ALL", "全部");
        put("Free", "免费");
        put("Items", "项目");
        put("Name", "名称");
        put("Description", "描述");
        put("Interfaces", "接口");
        put("Interfaces using this port", "使用此端口的接口");
        put("Pinouts with this port", "使用此端口的引脚图");
        put("Pinout", "引脚图");
        put("Pin", "引脚");
        put("Pins", "针脚");
        put("Port family:", "端口系列：");
        put("Available pins", "可用引脚");
        put("Total pins", "总针脚数");
        put("Navigate back", "返回");
        put("Navigate up", "转到上一层级");

        // ===== Settings =====
        put("Dark Mode", "深色模式");
        put("Keep Screen On", "保持屏幕常亮");
        put("Language", "语言");
        put("Terms and Conditions", "条款和条件");
        put("Privacy Policy", "隐私政策");
        put("Contact Us", "联系我们");
        put("REQUEST A FEATURE", "请求新功能");
        put("REPORT A BUG", "报告错误");
        put("Is there anything missing that you would like to see in the application? Request it and we will add it.", "应用中缺少您想看到的功能吗？请提出请求，我们会添加。");
        put("If you have encountered any errors, you can report them. We usually fix them within a week.", "如果您遇到任何错误，可以报告给我们。我们通常在一周内修复。");
        put("Quick Settings", "快捷设置");
        put("Ads Advanced Settings", "广告高级设置");

        // ===== Catalog =====
        put("CALCULATORS", "计算器");
        put("INTERFACES", "接口");
        put("BOARDS", "开发板");
        put("PORTS", "端口");
        put("These electrical and electronics engineering calculators are here to help you solve complex equations and calculations quickly.", "这些电气和电子工程计算器可帮助您快速解决复杂的方程和计算。");
        put("An interface is a shared boundary across which two or more separate components exchange information.", "接口是两个或多个独立组件之间交换信息的共享边界。");
        put("Single-board microcontrollers and microcontroller kits are equipped with sets of digital and analog input/output (I/O).", "单片机和微控制器套件配备了一组数字和模拟输入/输出（I/O）接口。");
        put("A port is the physical part of an interface. It is used to physically connect devices.", "端口是接口的物理部分，用于物理连接设备。");

        // ===== Calculator =====
        put("Calculate", "计算");
        put("Calculate Input", "计算输入");
        put("Calculate Output", "计算输出");
        put("Result", "结果");
        put("Analog to Digital", "模数转换");
        put("Sine Voltage", "正弦电压");
        put("Voltage Divider", "分压器");
        put("Resistors Connecting", "电阻连接");
        put("Capacitors Connecting", "电容器连接");
        put("Inductors Connecting", "电感器连接");
        put("Inductor Colors", "电感色环");
        put("Wave Parameters", "波形参数");
        put("Battery Life", "电池寿命");
        put("Resistor Colors", "电阻色环");
        put("Non-standard resistor", "非标准电阻");
        put("Ohm's Law", "欧姆定律");
        put("Battery Life Calculator", "电池寿命计算器");
        put("ADC Calculator", "ADC 计算器");
        put("Logic Circuit Simulator Pro", "逻辑电路模拟器 Pro");
        put("Voltage", "电压");
        put("Supply Voltage", "供电电压");
        put("Output Voltage", "输出电压");
        put("Input Voltage", "输入电压");
        put("Average Voltage", "平均电压");
        put("Peak Voltage", "峰值电压");
        put("Peak to Peek Voltage", "峰峰电压");
        put("ADC Value", "ADC 值");
        put("ADC Voltage", "ADC 电压");
        put("High Reference Voltage", "高参考电压");
        put("Low Reference Voltage", "低参考电压");
        put("Resolution", "分辨率");
        put("Quantization Levels", "量化级别");
        put("Current", "电流");
        put("Resistance", "电阻");
        put("Capacitance", "电容");
        put("Inductance", "电感");
        put("Frequency", "频率");
        put("Power", "功率");
        put("Energy", "能量");
        put("Resistor 1", "电阻 1");
        put("Resistor 2", "电阻 2");
        put("Battery Capacity", "电池容量");
        put("Serial Connection", "串联连接");
        put("Parallel Connection", "并联连接");
        put("Digital", "数字");
        put("Analog", "模拟");
        put("Input", "输入");
        put("Maximum", "最大值");
        put("Minimum", "最小值");
        put("Bands", "色环");
        put("3 Bands", "3 环");
        put("4 Bands", "4 环");
        put("5 Bands", "5 环");
        put("6 Bands", "6 环");
        put("Gamma", "伽马");
        put("Black", "黑色");
        put("Blue", "蓝色");
        put("Brown", "棕色");
        put("Gray", "灰色");
        put("Green", "绿色");
        put("Light Gray", "浅灰色");
        put("Purple", "紫色");
        put("Orange", "橙色");
        put("Pink", "粉色");
        put("Red", "红色");
        put("White", "白色");
        put("Yellow", "黄色");
        put("English (English)", "中文 (Chinese)");

        // ===== Port/Interface Names =====
        put("Accelerated Graphics Port", "加速图形端口");
        put("Mini-VGA Pinout", "Mini-VGA 引脚图");
        put("Micro-DVI Pinout", "Micro-DVI 引脚图");
        put("Thunderbolt", "雷电接口");
        put("Scart", "SCART 连接器");
        put("RS232 Null Modem Mapping", "RS232 零调制解调器映射");
        put("Fuses color coding", "保险丝颜色编码");
        put("USB 3.0/3.1 Type B", "USB 3.0/3.1 Type B");
        put("PS/2 Pinout", "PS/2 引脚图");
        put("PS/2 port", "PS/2 端口");
        put("IBM Personal System/2 Port", "IBM 个人系统/2 端口");
        put("Male", "公头");
        put("Female", "母头");
        put("Plug", "插头");
        put("Socket", "插座");
        put("Connector", "连接器");
        put("Cable", "电缆");
        put("Adapter", "适配器");
        put("6 Pins", "6 针");
        put("Status", "状态");
        put("Bookmark", "书签");

        // ===== Database content =====
        put("Fuses are an essential part of any electrical system. They are designed to fail automatically in the event of an electrical overload or short.", "保险丝是任何电气系统的重要组成部分，设计用于在电气过载或短路时自动熔断。");
        put("sacrificing themselves to save your wiring harness.", "牺牲自身以保护您的线路。");
        put("Given the nature of how fuses work, it's critical that you use the proper amp rating for the circuit.", "鉴于保险丝的工作原理，使用正确的电流额定值至关重要。");
        put("Too low a value and your fuses will blow prematurely, while using too high a value defeats the purpose of the fuse in the first place.", "额定值过低会导致保险丝过早熔断，而额定值过高则失去了保险丝的保护作用。");
        put("Its essential component is a metal wire or strip that melts when too much current flows through it, thereby stopping or interrupting the current.", "其核心部件是一根金属丝或金属带，当电流过大时会熔断，从而停止或中断电流。");
        put("A fuse is a small electrical component that protects your electrical circuit from overcurrent.", "保险丝是一种小型电气元件，用于保护您的电路免受过电流影响。");

        // ===== HISTORY DESCRIPTIONS =====
        put("AGP was originally designed as a successor to PCI-type connections for video cards. It was introduced in 1997. Shortly after its introduction, AGP was adopted by most computer hardware manufacturers, quickly supplanting PCI as the standard used for graphics cards. The AGP slot first appeared on x86-compatible system boards based on Socket 7 Intel P5 Pentium and Slot 1 P6 Pentium II processors. Soon afterward the AGP standard was revised, and it has been modified a few times since. Since 2004, AGP has been progressively phased out in favor of PCI Express (PCIe).", "AGP 最初是作为 PCI 类型显卡连接的继任者而设计的，于 1997 年推出。AGP 很快被大多数计算机硬件制造商采用，迅速取代 PCI 成为显卡的标准接口。AGP 插槽最早出现在基于 Socket 7 Intel P5 Pentium 和 Slot 1 P6 Pentium II 处理器的 x86 兼容主板上。此后 AGP 标准经过了多次修订。自 2004 年以来，AGP 已逐渐被 PCI Express (PCIe) 取代。");
        put("Although there are many analog audio interfaces with different physical connectors, the way the audio information is transmitted over them is the same. Analog audio interfaces are used to transmit AC sine waves. RCA connectors were first used as “Phono” outputs in the old AM radio models. Now they are used for audio inputs/outputs, composite and component video connections. The 2.5, 3.5mm Phono connectors are used for headphone/headset jacks in audio systems as well as in computers and mobile devices. XLR connectors are used in professional audio systems, they are also used for wiring of some loadspeakers. Today for wiring loudspeakers usually copper wires are used.", "尽管有许多使用不同物理连接器的模拟音频接口，但音频信息的传输方式是相同的。模拟音频接口用于传输交流正弦波。RCA 连接器最早用于旧式 AM 收音机的唱机输出，现在用于音频输入/输出、复合和分量视频连接。2.5mm、3.5mm 唱机连接器用于耳机插孔。XLR 连接器用于专业音频系统。");
        put("The 30-pin dock connector was introduced with the 3rd-generation iPod in April 2003 and was adopted by most of Apple’s mobile devices, with the exception of the iPod shuffle series. As iPod devices evolved, so did the dock connector, such as the addition of video signals. However, it was phased out and replaced by the more compact Lightning connector, which was introduced in September 2012.", "30 针 Dock 连接器于 2003 年 4 月随第三代 iPod 推出。苹果在 iPhone、iPad 和 iPod 产品线中使用了该连接器。2012 年 9 月，苹果推出了 Lightning 连接器来取代 30 针连接器。");
        put("The Lightning connector was introduced on September 12, 2012, as an upgrade to the 30-pin dock connector. It would soon be integrated with all new hardware and devices that was to be announced at the same event. Lightning uses 8 pins rather than 30, and can be inserted with either face up. It is significantly more compact than the 30-pin connector.", "Lightning 连接器于 2012 年 9 月推出，作为旧款 30 针 Dock 连接器的升级版。它是一种 8 针全数字连接器，支持正反插。");
        put("IBM introduced a new keyboard with each of its major desktop computer models. The original IBM PC, and later the IBM XT, used the XT keyboard. Next came the IBM AT system with AT Keyboard and later the IBM PS/2. These are obsolete and differ significantly from modern keyboards. AT keyboards and PS/2 keyboards were very similar devices, but the PS/2 device used a smaller connector and supported a few additional features. The AT Keyboard was released 1984 with IBM Personal Computer/AT. The AT Keyboard has 84 – 101 keys and uses the 5-pin DIN connector", "IBM 为其每一代主要台式计算机型号引入了新的键盘。这些键盘具有标准的 83 键布局。AT 键盘使用 5 针 DIN 连接器，后来被 PS/2 连接器取代。");
        put("The standard was developed by Intel in 1995 to improve on previous de facto standards like the AT design. It was the first major change in desktop computer enclosure, motherboard and power supply design in many years, improving standardization and interchangeability of parts. The ATX specifications have been revised numerous times since. The most recent ATX motherboard specification is version 2.2. As of 2021, the ATX design still remains the de facto standard for personal computers.", "ATX 标准由英特尔于 1995 年开发，旨在改进之前的 AT 和 Baby AT 标准。ATX 改进了主板布局和机箱设计。");
        put("The RCA connector (or Phono connector) is a type of electrical connector commonly used to carry audio and video signals. The name RCA derives from the company Radio Corporation of America, which introduced the design in the 1930s. The connectors male plug and female jack are called RCA plug and RCA jack. The connector was initially used for audio signals. Later Audio/Video systems like DVD or TVs, started using the AV Composite interface as input or output. The interface is using 3 RCA connectors to transfer Analog Audio(typically with red and white color coding) and analog composite video signal(typically using yellow color code).", "RCA 连接器（或唱机连接器）是一种常见的电气连接器，用于音频和视频信号。复合视频信号将亮度、色度和同步信号组合在一个通道中传输。");
        put("The RCA connector (or Phono connector) is a type of electrical connector commonly used to carry audio and video signals. The name RCA derives from the company Radio Corporation of America, which introduced the design in the 1930s. The connectors male plug and female jack are called RCA plug and RCA jack. The connector was initially used for audio signals. Later Audio/Video systems like DVD or TVs, started using the AV Composite interface as input or output. The interface is using 3 RCA connectors to transfer Analog Component Video signal too. The interface uses a technology superior to composite video signal. The three cables (Y, Pb and Pr) provided a higher quality connection than the single-wire composite cable commonly used to hook up earlier video equipment, because the brightness and color components of the signal were maintained separately. ", "分量视频通过三个独立的通道传输视频信号，提供比复合视频更好的图像质量。YPbPr 分量视频使用三个 RCA 连接器。");
        put("The first NTSC standard was developed in 1941 and had no provision for color. In 1953, a second NTSC standard was adopted, which allowed for color television broadcasting which was compatible with the existing stock of black-and-white receivers. NTSC was the first widely adopted broadcast color system and remained dominant until the 2000s, when it started to be replaced with different digital standards. In the 1950s, the Western European countries began plans to introduce colour television, and were faced with the problem that the NTSC standard demonstrated several weaknesses, including colour tone shifting under poor transmission conditions. To overcome NTSC’s shortcomings, alternative standards were devised, resulting in the development of the PAL and SECAM standards. The goal was to provide a colour TV standard for the European picture frequency of 50 hertz, and finding a way to eliminate the problems with NTSC.", "第一个 NTSC 标准于 1941 年开发，当时没有彩色功能。CVBS 将所有视频信息组合在一个信号中传输。");
        put("Developed by the Engineering Commission of United States Institute for Theatre Technology (USITT), the DMX512 standard (for Digital Multiplex with 512 pieces of information) was created in 1986, with subsequent revisions in 1990. DMX512 has also expanded to uses in non-theatrical interior and architectural lighting, at scales ranging from strings of Christmas lights to electronic billboards and stadium or arena concerts. It can now be used to control almost anything, reflecting its popularity in all types of venues.", "DMX512 由美国戏剧技术学会工程委员会开发，是一种用于灯光控制的数字通信协议。");
        put("The inventor of DisplayPort is Video Electronics Standards Association (VESA). The purpose of DisplayPort creation was to replace previous interface technologies such as the HDMI, VGA, and DVI that were mainly used for computer displays. In the display interface history, DisplayPort is the pioneer in applying the packet-based data transmission, a technology used in the Universal Serial Bus (USB). VESA invented the Displayport in May 2006. Ever since, the DisplayPort has improved its bandwidth and resolution with the development of newer versions. In 2014, DisplayPort 1.3 was established.", "DisplayPort 的发明者是视频电子标准协会（VESA），是一种数字显示接口标准。");
        put("DVI was designed in 1999 to be the solution for computer and HDTV compatibility for the 21st century. It was developed with the intention of creating an industry standard for the transfer of digital video content. This interface is designed to transmit uncompressed digital video and can be configured to support multiple modes such as DVI-A (analog only), DVI-D (digital only) or DVI-I (digital and analog). DVI was an improvement over the previous standard, VGA because it could carry analog video, and digital video on a single connector. The compatibility with VGA, along with other advantages, led to its widespread acceptance over competing digital display standards", "DVI 于 1999 年设计，旨在解决计算机和高清电视的兼容性问题。");
        put("EISA was announced in September 1988 by a consortium of PC clone vendors (the Gang of Nine) as an alternative to IBM’s proprietary Micro Channel architecture (MCA). EISA was much favoured by manufacturers due to the proprietary nature of MCA, and even IBM produced some machines supporting it. However it never became particularly popular in desktop PCs, but was reasonably successful in the server market.", "EISA 于 1988 年发布，是 ISA 总线的 32 位扩展。");
        put("Ethernet was developed at Xerox PARC between 1973 and 1974. It was inspired by ALOHAnet. It was commercially introduced in 1980 and first standardized in 1983 as IEEE 802.3. Ethernet has since been refined to support higher bit rates, a greater number of nodes, and longer link distances, but retains much backward compatibility. Over time, Ethernet has largely replaced competing wired LAN technologies such as Token Ring, FDDI and ARCNET. Over the course of its history, Ethernet data transfer rates have been increased from the original 2.94 megabits per second (Mbit/s) to the latest 400 gigabits per second (Gbit/s).", "以太网于 1973 年至 1974 年在施乐帕洛阿尔托研究中心开发，已成为最广泛使用的有线网络标准。");
        put("FireWire is Apple’s name for the IEEE 1394 High Speed Serial Bus. Its development was initiated by Apple in 1986, and developed by the IEEE P1394 Working Group. The group was driven by contributions from Sony, Apple, Panasonic, Philips, LG Electronics, Toshiba, Hitachi, Canon, INMOS/SGS Thomson (now STMicroelectronics) and Texas Instruments. Apple intended FireWire to be a serial replacement for the parallel SCSI bus, while providing connectivity for digital audio and video equipment. Apple’s development began in the late 1980s, later presented to the IEEE, and was completed in January 1995.", "FireWire 是苹果对 IEEE 1394 高速串行总线的命名，支持热插拔。");
        put("The game port first appeared during the initial launch of the original IBM PC in 1981, in the form of an optional expansion card known as the Game Control Adapter. At the time there was no industry standard for controller ports, although the Atari joystick port was close. Originally available only as add-on, game ports remained relatively rare in the early days of the IBM PC, and most games used the keyboard as an input. The game port became more common in the mid-1980s. However, the game port was given a major boost in usage in 1989, with the introduction of the first Sound Blaster. As sound cards were primarily used with computer games, Creative Labs took the opportunity to include a game port on the card, producing an all-in-one gaming solution.", "游戏端口最早出现在 1981 年原始 IBM PC 中，是一个 15 针 D-sub 连接器。");
        put("In the late 1960s, Hewlett-Packard (HP) manufactured various automated test and measurement instruments, such as digital multimeters and logic analyzers. They developed the HP Interface Bus (HP-IB) to enable easier interconnection between instruments and controllers (computers and other instruments). HP licensed the HP-IB patents for a nominal fee to other manufacturers. It became known as the General Purpose Interface Bus (GPIB), and became a de facto standard for automated and industrial instrument control.", "惠普在 1960 年代末开发了 GPIB（通用接口总线），后来被标准化为 IEEE 488。");
        put("The HDMI founders were Hitachi, Panasonic, Philips, Silicon Image, Sony, Thomson, and Toshiba. They began development on HDMI 1.0 on April 16, 2002, with the goal of creating an AV connector that was backward-compatible with DVI. HDMI 1.0 was designed to improve on DVI by using a smaller connector and adding audio capability. HDMI began to appear on consumer HDTVs in 2004 and camcorders and digital still cameras in 2006. Currently it’s widely used in almost any audio/video systems, mobile devices and computers.", "HDMI 由日立、松下、飞利浦、Silicon Image、索尼和汤姆逊共同创建，是一种全数字高清接口。");
        put("Originally called the AT bus and introduced with the IBM PC AT in 1984, the AT/ISA bus extended the PC bus from 8 to 16 bits. For several years, motherboards provided a mix of both 8-bit and 16-bit ISA slots. Companies like Dell improved the AT bus’s performance but in 1987, IBM replaced the AT bus with its proprietary Micro Channel Architecture (MCA). The 16-bit ISA bus was also used with 32-bit processors for several years. An attempt to extend it to 32 bits, called Extended Industry Standard Architecture (EISA), was not very successful, however. ISA was being replaced entirely by the PCI interface.", "最初称为 AT 总线，于 1984 年随 IBM PC AT 推出，是一种 16 位计算机总线。");
        put("The Joint Test Action Group formed in 1985 to develop a method of verifying designs and testing circuit boards after manufacture. In 1990 the Institute of Electrical and Electronics Engineers (IEEE) codified the results of the effort in IEEE Standard 1149.1–1990. In the same year, Intel released their first processor with JTAG (the 80486) which led to quicker industry adoption by all manufacturers. Since 1990, this standard has been adopted by electronics companies around the world.", "联合测试行动小组（JTAG）于 1985 年成立，用于验证设计和制造方法。");
    }

    private static void put(String en, String zh) {
        ZH.put(en, zh);
    }

    public static String getTranslation(String text) {
        if (text == null) return null;
        init();
        return ZH.get(text);
    }

    public static int getCount() {
        return ZH.size();
    }
}
