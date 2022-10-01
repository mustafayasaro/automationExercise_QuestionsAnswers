package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeClassAfterClass;

public class TC_05 extends TestBaseBeforeClassAfterClass {

    @Test
    public void test01() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//*[@style=\"color: orange;\"]"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        WebElement signIn = driver.findElement(By.xpath("//*[text()=' Signup / Login']"));
        signIn.click();

        //5. Verify 'New User Signup!' is visible
        WebElement newUser = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        Assert.assertTrue(newUser.isDisplayed());

        //6. Enter name and email address

        WebElement name = driver.findElement(By.xpath("//*[@data-qa='signup-name']"));
        name.sendKeys("Jhon");
        WebElement email = driver.findElement(By.xpath("(//*[@name='email'])[2]"));
        email.sendKeys("jhonaltusthail@gmail.com");

        //7. Click 'Signup' button
        WebElement logIn = driver.findElement(By.xpath("//*[text()='Signup']"));
        logIn.click();

        //8. Verify error 'Email Address already exist!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Email Address already exist!']")).isDisplayed());
    }
}
