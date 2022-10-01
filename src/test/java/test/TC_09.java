package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeClassAfterClass;

import java.util.List;

public class TC_09 extends TestBaseBeforeClassAfterClass {

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
        //6. Enter product name in search input and click search button
        //7. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='search_product']")).isDisplayed());
        WebElement searchProduct = driver.findElement(By.xpath("//*[@id='search_product']"));
        searchProduct.sendKeys("Tshirt");
        driver.findElement(By.xpath("//*[@id='submit_search']")).click();




        //8. Verify all the products related to search are visible
        WebElement listProducts = driver.findElement(By.xpath("//*[text()='Men Tshirt']"));
        Assert.assertTrue(listProducts.getText().contains("Tshirt"));



    }
}
