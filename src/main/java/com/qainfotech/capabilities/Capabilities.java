package com.qainfotech.capabilities;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

/**
*
* @author Saksham Varshney
*/
public class Capabilities
{
    public static DesiredCapabilities cap;
    public static AndroidDriver<AndroidElement> driver;
    
    /**
    * capabilitiesMethod(): It is use to set the desired capabilities.
    * @param deviceName : String
    * @param platformName : String
    * @param appPackage : String
    * @param appActivity : String
    * @param serverUrl : String
    */
    public static AndroidDriver<AndroidElement> setcapabilitiesMethod(String deviceName, String platformName, String appPackage, String appActivity, String serverUrl) throws MalformedURLException, FileNotFoundException
    {
        cap = new DesiredCapabilities();
        
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        cap.setCapability("platformName", platformName);
        cap.setCapability("noReset", true);
        cap.setCapability("appPackage", appPackage);
        cap.setCapability("appActivity", appActivity);
        
        URL url = new URL(serverUrl);
        driver= new AndroidDriver<>(url, cap);
        
        return driver;
    }
}