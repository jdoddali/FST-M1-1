package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement postaJob = driver.findElement(By.id("menu-item-26"));
        postaJob.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement EnterMailid = driver.findElement(By.id("create_account_email"));
        EnterMailid.sendKeys("k@yahoo.com");

        WebElement JobTitle = driver.findElement(By.id("job_title"));
        JobTitle.sendKeys("IT Specialist");

        WebElement JobLocation = driver.findElement(By.id("job_location"));
        JobLocation.sendKeys("Bangalore");

        WebElement applicationEmail = driver.findElement(By.id("application"));
        applicationEmail.sendKeys("smcindia@in.ibm.com");
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement jobDescription = driver.findElement(By.id("job_description_ifr"));
        jobDescription.sendKeys("IT Specialist");

        driver.findElement(By.id("company_name")).sendKeys("IBM");
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/form/p/input[4]")).click();
        //WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("job_preview_submit_button")).click();

//Verify that the job listing was posted by visiting the jobs page.
        driver.findElement(By.id("menu-item-24")).click();
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SearchField = driver.findElement(By.id("search_keywords"));
        SearchField.sendKeys("IT Specialist");
        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement SearchSubmit = driver.findElement(By.xpath("//div[@class = \"search_submit\"]"));
        SearchSubmit.click();
        WebElement JobSearchFirstRow = driver.findElement(By.xpath("(//span[\"Intelligence Business Machines\"])[5]"));
 driver.close();
    }
}
