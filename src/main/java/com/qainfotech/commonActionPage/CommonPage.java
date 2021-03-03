package com.qainfotech.commonActionPage;

import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

/**
*
* @author Saksham Varshney
*/
public class CommonPage
{
    AndroidDriver driver;

    public CommonPage(AndroidDriver driver)
    {
        this.driver= driver;
    }
    
    public void sendingKeys(By locator, String keys)
    {
        driver.findElement(locator).sendKeys(keys);
    }
    
    public void click(By locator)
    {
        driver.findElement(locator).click();
    }
}