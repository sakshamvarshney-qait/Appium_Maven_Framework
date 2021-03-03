package com.qainfotech.actionPages;

import org.openqa.selenium.By;
import com.qainfotech.commonActionPage.CommonPage;
import io.appium.java_client.android.AndroidDriver;
import static com.qainfotech.pageUtilities.LocatorReader.*;
import java.io.IOException;

/**
*
* @author Saksham Varshney
*/
public class SearchFunctionality extends CommonPage
{
    By homepageSearchBox;
    String locatorFilePath= "searchSection";
    AndroidDriver driver;
    
    public SearchFunctionality(AndroidDriver driver)
    {
        super(driver);
        this.driver= driver;
        LocatorsFilePathSetter(locatorFilePath);
    }

    public void clickOnHomepageSearchBox() throws IOException
    {
        homepageSearchBox = LocatorProvider("homepageSearchBox");
        click(homepageSearchBox);
    }
}