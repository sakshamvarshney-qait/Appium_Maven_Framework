package com.qainfotech.pageUtilities;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.openqa.selenium.By;

/**
 *
 * @author Saksham Varshney
 */
public class LocatorReader
{
    public static String LocatorsFilePath;
    
    /**
     * LocatorsFilePathSetter(): It sets the filePath of the locators data file by passing fileName in the parameter.
     */
    public static void LocatorsFilePathSetter(String fileName)
    {
        LocatorsFilePath = "src\\main\\resources\\pageObjects\\"+fileName+".spec";
    }
    
    /**
     *  LocatorProvider(): It provides the locatorType and locatorValue of the WebElement
     * and then call getLocatorValue() to get the locator.
     */
    public static By LocatorProvider(String locatorName) throws IOException
    {
        String locatorType = null;
        String locatorValue = null;
        boolean status=false;
        
        File file=new File(LocatorsFilePath);
        Scanner scan=new Scanner(file);
        while (scan.hasNextLine())
        {
            String[] data = scan.nextLine().split("\\s+");
            
            if(data[0].equals(locatorName))
            {
                locatorType=data[1];
                locatorValue=data[2];
                status = true;
                break;
            }
        }
        
         if(status==true)
         {
            return getLocatorValue(locatorType, locatorValue);
         }
         return null;
    }
    
    /**
     * getLocatorValue(): providing Locator.
     */
    public static By getLocatorValue(String locatorType, String locatorValue)
    {
        By locator = null;
        switch(locatorType)
        {
            case "id":
                locator = By.id(locatorValue);
                break;

            case "name":
                locator = By.name(locatorValue);
                break;
            
            case "cssSelector":
                locator = By.cssSelector(locatorValue);
                break;

            case "linkText":
                locator = By.linkText(locatorValue);
                break;

            case "xpath":
                locator = By.xpath(locatorValue);
                break;
            }
            return locator;
        }
}