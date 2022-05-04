package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import static sun.rmi.rmic.Main.getText;


public class Activity4 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");

        WebElement WelcomeTitle =   driver.findElement(By.className("entry-title"));
        System.out.println(WelcomeTitle);
        driver.get("https://alchemy.hguy.co/jobs/");

        WebElement secondHeading = driver.findElement(By.xpath("//h2[contains(text(),\"Quia quis non\")]"));
        String HeaderName = new String(secondHeading.getText());
        System.out.println("If matches yes print TRUE:" + HeaderName);
        System.out.println("If matcthed with \"Quia quis non\" print TRUE :" + HeaderName.equals("Quia quis non"));

        if(HeaderName.equals("Quia quis non"))
        {System.out.println("True");
        driver.close();}
        else System.out.println("False");

        //System.out.println("Text in element: " + linkTextLocator.getText());
        //WebElement WelcomeTitle = driver.findElement(By.className("entry-title"));

        //WebElement Headerimage = driver.findElement(By.className("attachment-large size-large wp-post-image"));
        //System.out.printf("Class%s%n", Headerimage.getSize());
        //System.out.println(Headerimage);
        // Close the browser

    }
}