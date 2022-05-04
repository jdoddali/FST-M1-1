package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");

        //String pageTitle = driver.getTitle();
        //System.out.println(pageTitle);

        WebElement WelcomeTitle =   driver.findElement(By.className("entry-title"));
        System.out.println(WelcomeTitle);
        // Close the browser
        driver.close();
    }

}
