package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeClassAfterClass;

public class TC_07 extends TestBaseBeforeClassAfterClass {

    @Test
    public void test01() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//*[@style=\"color: orange;\"]"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Test Cases' button
        driver.findElement(By.xpath("(//*[@class='fa fa-list'])[1]")).click();

        //5. Verify user is navigated to test cases page successfully
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Test Cases']")).isDisplayed());


    }
}
