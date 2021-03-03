package com.qainfotech.Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 *
 * @author Saksham Varshney
 */
public class AutoGeneratedReport
{
    public ExtentHtmlReporter reporter;
    public ExtentReports extent;
    public ExtentTest test;
    
    @BeforeSuite
    public void reportSetUp()
    {
        reporter = new ExtentHtmlReporter("Reports\\TimelineReport\\index.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
    }
    
    @AfterSuite
    public void reportTearDown()
    {
        extent.flush();
    }
}