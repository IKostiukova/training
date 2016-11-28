package com.automation.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Created by irmar on 11/21/2016.
 */
public class GoogleSearch {
    @Before
    public void beforeTest(){
        System.setProperty("webdriver.gecko.driver","D:\\Git\\Test\\training\\IKostiukova\\src\\test\\resources\\geckodriver.exe");

    }
    @Test
    public void testSearchResults() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com.ua");
        driver.findElement(By.xpath("//div[3]/div/input")).sendKeys("test");
        driver.findElement(By.name("btnG")).click();

        Thread.sleep(1000);

        int countSearchResults = driver.findElements(By.className("g")).size();
        Assert.assertEquals(countSearchResults, 10);

        driver.quit();

    }
}
