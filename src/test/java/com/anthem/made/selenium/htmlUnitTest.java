package com.anthem.made.selenium;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.apache.tools.ant.taskdefs.Java;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by AF11126 on 8/24/2018.
 */
public class htmlUnitTest {
    @Test
    public void htmlUnitTest() {
        WebDriver driver = new HtmlUnitDriver();
        //WebDriver driver = new HtmlUnitDriver(true);

        //WebDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME, true);

        //System.setProperty("webdriver.chrome.driver",  "C:\\Drivers\\chromedriver.exe");
        //driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Open "Google.com and search SoftwareTestingMaterial.com"
        //DesiredCapabilities capa = DesiredCapabilities.firefox();
        //capa.setCapability("marionette", false);

        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.name("qt"));
        element.sendKeys("softwaretestingmaterial.com");
        element.submit();
        //Click on Software Testing Material link
        driver.findElement(By.linkText("Software Testing Material")).click();
        // Get the title of the site and store it in the variable Title
        String Title = driver.getTitle();
        // Print the title
        System.out.println("I am at " +Title);

        //JavascriptExecutor
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].click()",driver.findElement(By.id("ff")));

        Alert alert = driver.switchTo().alert();
        alert.accept();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200");
       ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,200)", "");

    }
}
