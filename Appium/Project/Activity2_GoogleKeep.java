package liveProject;


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2_GoogleKeep {
    // Declare Android driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel API 28");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        //        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);


        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Open tasks Using Accessibility ID
        driver.findElementByAccessibilityId("Keep Notes").click();
    }

    @Test
    public void addNote() {
        WebDriverWait wait1 = new WebDriverWait(driver, 10);

        wait1.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("tasks_fab")));
        MobileElement addTaskButton = driver.findElementById("tasks_fab");
        addTaskButton.click();


        //wait1.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("com.google.android.apps.tasks:id/add_task_title")));
        //driver.findElementById("add_task_title").sendKeys("1.Complete Activity with Google Tasks");
//New tasks added

        driver.findElementById("add_keep_title").sendKeys("1.Complete Activity with Google Tasks");
        addTaskButton.click();
        driver.findElementById("add_task_title").sendKeys("2.Complete Activity with Google Keep");
        addTaskButton.click();
        driver.findElementById("add_task_title").sendKeys("3.Complete the second Activity Google Keep");
        //Save  tasks
        driver.findElementById("SAVE XPATH or RESOURCE ID").click();
//by xpath
        // driver.findElementByXPath("//android.widget.Button[@text='9']").click();


        // String result = driver.findElement(MobileBy.id("result")).getText();

        System.out.println("OK");

        // Assertion
        //Assert.assertEquals(result, "45");

//Assert.assertEquals(string actual, string expected);
    }

    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}

