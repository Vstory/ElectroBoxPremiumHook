# ElectroBox Premium Hook

LSPosed/Xposed 模块，绕过 **ElectroBox - Electronics** 的订阅/付费限制，解锁全部功能。

## 🎯 解锁内容

- ✅ 解锁付费功能（绕过 isPremium / isHardPremium 付费检查）
- ✅ 关闭付费弹窗（跳过 GoPremium 弹窗初始化）
- ✅ 解除列表项 / 搜索结果限制
- ✅ 解除设置页面功能限制

## 目标应用

| 项目 | 值 |
|------|-----|
| 应用名 | ElectroBox - Electronics |
| 包名 | `com.duracodefactory.electrobox.electronics` |
| 版本 | 52 (versionCode: 56) |

## 安装方法

1. 安装 LSPosed (需要 Root + Magisk/KernelSU)
2. 编译此模块 (Android Studio)
3. 安装生成的 APK
4. 在 LSPosed 中启用模块，勾选 **ElectroBox - Electronics** 作为作用域
5. 重启 ElectroBox 应用 (或重启手机)

## 项目结构

```
ElectroBoxPremiumHook/
├── build.gradle
├── README.md
├── dev-project/
│   ├── analysis.md          # 逆向分析 & Hook 方案
│   └── CHANGELOG.md         # 更新日志
└── src/main/
    ├── AndroidManifest.xml
    ├── assets/
    │   └── xposed_init
    ├── java/com/hook/electrobox/
    │   └── HookEntry.java
    └── res/values/
        └── arrays.xml
```
