package liveProject;


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity3_GoogleChrome {
    WebDriverWait wait;
    AndroidDriver<MobileElement> driver = null;
    // Declare Android driver
    // AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 3 API 28");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        caps.setCapability("noReset", true);


        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Open page
        driver.get("https://www.training-support.net/selenium");
    }

    @Test
    public void scrollIntoViewTest() {
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        // Wait for the page to load
        WebDriverWait wait1 = new WebDriverWait(driver, 10);
        wait1.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.view.View")));
        System.out.println("Page opens");

//Login
        wait1.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Login\")")));
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Login\")")).click();

        wait1.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Welcome Back!\")")));
//User name- wait and input
        MobileElement userName = driver.findElementByXPath("//android.widget.EditText[@index,1");

        wait1.until(ExpectedConditions.elementToBeClickable(userName));

        MobileElement password = driver.findElementByXPath("//android.widget.EditText[@text='Password']");


        userName.sendKeys("admin");
        password.sendKeys("passwordInvalid");

        wait1.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().text(\"You tried to login using invalid credentials. Please try again.\")")));

        MobileElement loginFailureMessage = driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"You tried to login using invalid credentials. Please try again.\")"));
        Assert.assertTrue(loginFailureMessage.isDisplayed());


    }


    @AfterClass
    public void tearDown() {
        // Close app
        driver.quit();
    }
}
