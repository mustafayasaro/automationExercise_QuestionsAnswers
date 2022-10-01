package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utulities.TestBaseBeforeClassAfterClass;

public class TC_02 extends TestBaseBeforeClassAfterClass {

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

        //5. Verify 'Login to your account' is visible
        WebElement newUser = driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        Assert.assertTrue(newUser.isDisplayed());

        //6. Enter correct email address and password
        WebElement email = driver.findElement(By.xpath("(//*[@name='email'])[1]"));
        email.sendKeys("jhonaltusthail@gmail.com");
        WebElement password2 = driver.findElement(By.xpath("//*[@name='password']"));
        password2.sendKeys("polonya01");


        //7. Click 'login' button
        driver.findElement(By.xpath("//*[text()='Login']")).click();

        //8. Verify that 'Logged in as username' is visible
        WebElement usernameVisible = driver.findElement(By.xpath(" //*[text()=' Logged in as ']"));
        Assert.assertTrue(usernameVisible.isDisplayed());

        //9. Click 'Delete Account' button
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()=' Delete Account']"));
        deleteButton.click();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertTrue(driver.findElement(By.xpath("(//*[text()='Delete Account'])[2]")).isDisplayed());
    }
}
