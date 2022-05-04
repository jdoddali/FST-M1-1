package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");

        String pageTitle = driver.getTitle();
        System.out.println("If matches yes print TRUE:" + pageTitle.contentEquals("Alchemy Jobs – Job Board Application"));
        driver.close();
        //System.out.println("Text in element: " + linkTextLocator.getText());
        //WebElement WelcomeTitle = driver.findElement(By.className("entry-title"));

        //WebElement Headerimage = driver.findElement(By.className("attachment-large size-large wp-post-image"));
        //System.out.printf("Class%s%n", Headerimage.getSize());
        //System.out.println(Headerimage);
        // Close the browser

    }
}