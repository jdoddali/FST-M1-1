package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin/");
        WebElement UserName = driver.findElement(By.id("user_login"));
        UserName.sendKeys("root");

        WebElement Password = driver.findElement(By.id("user_pass"));
        Password.sendKeys("pa$$w0rd");
        WebElement LoginButton = driver.findElement(By.id("wp-submit"));
        LoginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wp-admin-bar-my-account")));
        System.out.println("Logged in successfully as Admin");
        driver.close();

    }
}
