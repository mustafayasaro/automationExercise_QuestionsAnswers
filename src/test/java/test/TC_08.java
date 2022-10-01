package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeClassAfterClass;

public class TC_08 extends TestBaseBeforeClassAfterClass {

    @Test
    public void test01() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//*[@style=\"color: orange;\"]"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Products' button
        driver.findElement(By.xpath("//*[text()=' Products']")).click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='All Products']")).isDisplayed());

        //6. The products list is visible


        //7. Click on 'View Product' of first product
        driver.findElement(By.xpath("(//*[@class='fa fa-plus-square'])[1]")).click();


        //8. Verify that detail is visible: product name, category, price, availability, condition, brand
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Blue Top']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Category: Women > Tops']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Rs. 500']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Availability:']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Condition:']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Brand:']")).isDisplayed());


    }
}
