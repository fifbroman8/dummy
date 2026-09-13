# Android Service Application

这是一个最简单的 Android Service 应用，没有 UI 界面，安装后没有应用图标。

## 特性
- 包名: `com.abc.dummy`
- 无启动器活动（不会显示应用图标）
- 包含一个简单的后台服务

## 编译和安装

```bash
# 使用 Android Studio 或
./gradlew assembleDebug

# 安装到设备
adb install -r app-debug.apk
```

## 启动服务

可以通过以下方式启动服务：

```bash
adb shell am startservice com.abc.dummy/.MyService
```

## 查看日志

```bash
adb logcat | grep MyService
```
