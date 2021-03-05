# Appium Maven Framework
---

**@author Saksham Varshney**

## Description: Appium complete Maven framework with auto generated report.

### To Run this project:
**Prerequisite:**

	1. jdk should installed in the machine
	2. MAVEN_HOME should already set in system variables.

**Steps:**

	1. Open cmd and run following commands:
	2. cd projectPath
	3. mvn clean
	4. mvn test

---

### Reports:
Reports that are used:

	1. Extent Report

---

### How to create Virtual Device:
**Steps:**

	1. Download Android Studio
	2. Go to avd manager
	3. Click on create virtual device
	4. Select Device
	5. Select OS
	6. Finish

---

### How to start the Emulator:
There are two ways:
1. Through Android Studio:

**Steps:**

	1. Open Android Studio
	2. Go to avg manger
	3. start the emulator

2. Through cmd:

**Steps:**

	1. Open cmd and run following commands:
	2. cd C:\Users\UserName\AppData\Local\Android\Sdk\emulator
	3. emulator -avd deviceName

---

### How to connect Real device:
**Steps:**

	1. Download the Vysor app on Window/Mac/Linux.
	2. Download the Vysor app on Mobile device as well from app store.
	3. In Mobile, Activate the Developer mode by tapping 7 times on build number on setting-> about phone.
	4. Enable the USB Debugging.
	5. Connect Mobile Device with Machine through USB.
	6. Click on Play button on Vysor app on Machine.

---

### Check connected devices on Machine:
**Steps:**

	1. Open cmd and run the following command:
	2. adb devices

---

### Appium Installation:
There are two ways:
1. Install Appium through npm:

**Steps:**
	
	1. Open cmd and run following command:
	2. npm install -g appium

2. Install Appium through their official site(Desktop version):
	
	site: http://appium.io/

---

### Mobile Automation through Appium:
There are two ways:
1. Through Record and play in Appium Desktop:

**Steps:**

	1. Activate the Emulator/Virtual Device/Real Device.
	2. Start the server through Appium Desktop.
	3. Click on the search icon to start the session.
	4. Fill the capabilities in json format.
	ref: [Appium Desired Capabilities](http://appium.io/docs/en/writing-running-appium/caps/ "Capabilities")
	5. Click on start session.

2. Through IDE:

**Note:** Refer to source code or click on below link:

[Source code](https://github.com/sakshamvarshney-qait/Appium_Maven_Framework/tree/master/src "code")

---

### Inspect the element:
There are two ways:
1. Through uiautomatorviewer:

**Prerequisite:**

	1. open the Emulator/Virtual Device/Real Device.

**Steps:**

	1. go to C:\Users\UserName\AppData\Local\Android\Sdk\tools\bin
	2. open the uiautomatorviewer file.
	3. click on Device Screenshot button.

2. Through Appium Desktop:

**Prerequisite:**

	1. open the Emulator/Virtual Device/Real Device.

**Steps:**

	1. Start the Appium server through Appium Desktop.
	2. Click on Start Inspector Session icon.
	3. Set the desired capabilities.
	4. Click on start session.
	
---
	
### To know information about appPackage and appActivity:
**Prerequisite:**

	1. Start the Emulator/Virtual Device/Real Device.
	2. Open the App which you want to use for automation.

**Steps:**

	1. Open cmd and run following commands:
	2. adb shell
	3. dumpsys window windows | grep -E 'mCurrentFocus'

---
	
### Error related to adb devices offline:
**Steps:**
	
	1. Open cmd and run following commands:
	2. adb devices
	if it shows offline then,
	3. netstat -aon|findstr 5037
	3. end adb(32 bit) task in task manager
	4. adb kill-server
	5. adb start-server
	6. adb devices
	if it shows offline again then,
	7. adb reconnect device

---
	
### Facing issue realted to appium setting on mobile device:
There are two ways:
1. Issue with Real Device:

**Steps:**

	1. Open cmd and run following command:
	2. adb uninstall io.appium.settings

2. Issue with Emulator/Virtual device:

**Steps:**

	1. Open Android Studio.
	2. Click on File -> Invalidate caches / Restart
	3. Open AVD Manager
	4. Click on down arrow in device and click on cold boot now
	
---

### To know more about Appium:
**Note:** refer to Appium Notes that is store at root of this project or click on below link:

[Appium Notes](https://github.com/sakshamvarshney-qait/Appium_Maven_Framework/blob/master/Appium%20notes.txt "Notes")

---

### Architecture:
![Appium Architecture](https://github.com/sakshamvarshney-qait/Appium_Maven_Framework/blob/master/appium-architecture.png "Architecture")

---