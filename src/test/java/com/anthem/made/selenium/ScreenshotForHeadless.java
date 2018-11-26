package com.anthem.made.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by AF11126 on 8/31/2018.
 */
public class ScreenshotForHeadless {
    public static void main(String[] args) {

        //Set Chrome Headless mode as TRUE
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        //Instantiate Web Driver and open web page
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println("Page title is - " + driver.getTitle());

        //Take screenshot
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        //String sfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        try {
            FileUtils.copyFile(file, new File("C:\\temp\\headless_screenshot.png"));
            FileUtils.copyFile(file, new File("C:\\temp\\headless_screenshot_string_base.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Take screenshot for Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();

        try {
            File chromeFile = chromeDriver.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(chromeFile, new File("file path"));
        } catch (IOException e) {
        e.printStackTrace();
    }


        Actions action = new Actions(driver);
        action.clickAndHold().moveToElement(driver.findElement(By.id("dddddd"))).clickAndHold().release().build().perform();
        //action.moveToElement(element).build().perform();

        driver.findElement(By.linkText("iPads")).click();
        driver.close();
    }
}
