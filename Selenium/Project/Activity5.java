package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity5 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/") ;
        WebDriverWait Sleep = new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.findElement(By.id("menu-item-24")).click();
        WebDriverWait Sleep1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        String JobPageTitle = driver.getTitle();
        System.out.println(JobPageTitle);
        System.out.println("If matcthed with \"Jobs – Alchemy Jobs\" print TRUE :" + JobPageTitle.equals("Jobs – Alchemy Jobs"));
        driver.close();
    }

}
