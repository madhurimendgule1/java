package com.anthem.made.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by AF11126 on 8/24/2018.
 */
public class DriverTest {

    public static void main(String args[]) {
        testHtmlUnitDriver();
    }

    public static void testHtmlUnitDriver() {
        WebDriver driver = null;
        driver= new HtmlUnitDriver();
        //System.setProperty("webdriver.chrome.driver",  "C:\\Drivers\\chromedriver.exe");
        //driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Open "Google.com and search SoftwareTestingMaterial.com"
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("softwaretestingmaterial.com");
        element.submit();
        //Click on Software Testing Material link
        driver.findElement(By.linkText("Software Testing Material")).click();
        // Get the title of the site and store it in the variable Title
        String Title = driver.getTitle();
        // Print the title
        System.out.println("I am at " +Title);

    }
}