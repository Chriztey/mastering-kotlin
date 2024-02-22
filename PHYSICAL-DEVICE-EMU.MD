# Using Android Phone as Emulator for Kotlin Project

## Introduction

In some cases, you might prefer using your Android phone as an emulator for running Kotlin projects, especially when testing on real devices is crucial. This guide will walk you through the steps to set up your Android phone as an emulator for your Kotlin project.

## Prerequisites

- Android phone with USB debugging enabled
- USB cable to connect your phone to your development machine
- Android Studio installed on your development machine

## Steps

### 1. Enable Developer Options on your Android Phone

1. Open the "Settings" app on your Android phone.
2. Scroll down and tap on "About phone."
3. Find and tap on the "Build number" entry multiple times until you see a message indicating that Developer Options have been enabled.

### 2. Enable USB Debugging

1. In the "Settings" app, go to "System" and then "Developer options."
2. Enable the "USB debugging" option.

### 3. Connect Your Android Phone to Your Development Machine

1. Connect your Android phone to your development machine using a USB cable.
2. When prompted on your phone, allow USB debugging.

### 4. Configure Android Studio

1. Open Android Studio on your development machine.
2. In Android Studio, go to "View" and select "Tool Windows" > "Logcat" to open the Logcat pane.
3. Ensure that your connected Android device is recognized in the Logcat pane.

### 5. Run Your Kotlin Project

1. Open your Kotlin project in Android Studio.
2. Click on the "Run" button (green triangle) in the toolbar.
3. In the "Select Deployment Target" window, choose your connected Android device.

Now, your Kotlin project will be deployed and run on your Android phone. You can view the application output and debug using the Logcat pane in Android Studio.

## Conclusion

Using your Android phone as an emulator for your Kotlin project provides a real-world testing environment. Ensure that your phone meets the necessary requirements and that USB debugging is enabled for a seamless development experience.