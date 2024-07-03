package org.example;

import static org.junit.Assert.assertTrue;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1()
    {
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("report.html");

        ExtentReports extentReports=new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        ExtentTest extentTest =  extentReports.createTest("Test1");
        extentTest.log(Status.PASS,"Hi its your first report");

        ExtentTest extentTest2 =  extentReports.createTest("Test2");
        extentTest2.log(Status.FAIL,"Hi its your first report");

        ExtentTest extentTest3 =  extentReports.createTest("Test3");
        extentTest3.log(Status.INFO,"Hi its your first report");

        extentReports.flush();
    }

    @Test
    public void test2() {

    }
}
