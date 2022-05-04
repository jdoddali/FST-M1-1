package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
        WebElement UserName = driver.findElement(By.id("user_login"));
        UserName.sendKeys("root");

        WebElement Password = driver.findElement(By.id("user_pass"));
        Password.sendKeys("pa$$w0rd");
        WebElement LoginButton = driver.findElement(By.id("wp-submit"));
        LoginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wp-admin-bar-my-account")));
        System.out.println("Logged in successfully as Admin");

        WebElement JobListing = driver.findElement(By.xpath("//li[@id =\"menu-posts-job_listing\"]"));
        JobListing.click();
        WebElement AddNewButton = driver.findElement(By.className("page-title-action"));
        AddNewButton.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Close Modal Window
        WebElement ModalwindowCloseButton = driver.findElement(By.xpath("//div[@class=\"components-modal__header\"]//button[@class=\"components-button has-icon\"]"));
        ModalwindowCloseButton.click();

        WebElement Position = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[2]/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div/div[1]/div/div/div/textarea"));
        Position.sendKeys("O Therapist");


        driver.findElement(By.id("_company_website")).sendKeys("www.jacksnjills.com");

        driver.findElement(By.id("_company_name")).sendKeys("JACKS_N_JILLS");
        driver.findElement(By.id("_company_tagline")).sendKeys("About Neuro diversity");

        WebElement PublishButton= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/button[2]"));
        PublishButton.click();
        PublishButton.click();

        WebElement CompanyTagline= driver.findElement(By.className("tagline"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("job_description")));


        driver.close();

    }
}