package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs");
        driver.findElement(By.id("menu-item-24")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SearchField = driver.findElement(By.id("search_keywords"));
        SearchField.sendKeys("Banking");
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SearchSubmit = driver.findElement(By.xpath("//div[@class = \"search_submit\"]"));
        SearchSubmit.click();
        WebElement JobSearchFirstRow = driver.findElement(By.xpath("(//span[\"Intelligence Business Machines\"])[5]"));
        JobSearchFirstRow.click();
        WebElement applyJob = driver.findElement(By.xpath("input[@class = \"application_button button\"]"));
        applyJob.click();
        driver.close();
        }
}
