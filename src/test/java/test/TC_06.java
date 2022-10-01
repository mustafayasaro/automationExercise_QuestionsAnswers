package test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utulities.TestBaseBeforeClassAfterClass;

public class TC_06 extends TestBaseBeforeClassAfterClass {

    @Test
    public void test01() {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        WebElement homePage = driver.findElement(By.xpath("//*[@style=\"color: orange;\"]"));
        Assert.assertTrue(homePage.isDisplayed());

        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//*[@class='fa fa-envelope']")).click();

        //5. Verify 'GET IN TOUCH' is visible
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Get In Touch']")).isDisplayed());

        //6. Enter name, email, subject and message
        Actions actions = new Actions(driver);
        WebElement name = driver.findElement(By.xpath("//*[@class='form-control']"));
        name.sendKeys("asd");
        driver.findElement(By.xpath("(//*[@class='form-control'])[2]")).sendKeys("jhonaltusthail@gmail.com");
        driver.findElement(By.xpath("//*[@name='subject']")).sendKeys("dsasdad");
        driver.findElement(By.xpath("//*[@name='message']")).sendKeys("sadas");


        //7. Upload file
        WebElement dosyaSec= driver.findElement(By.xpath("(//*[@class='form-control'])[5]"));
        String dosyaYolu = "C:\\Users\\Hp\\automation.txt.txt";
        dosyaSec.sendKeys(dosyaYolu);

        //8. Click 'Submit' button
        driver.findElement(By.xpath("//*[@name='submit']")).click();

        //9. Click OK button
        driver.switchTo().alert().accept();

        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        Assert.assertTrue(driver.findElement(By.xpath("(//*[text()='Success! Your details have been submitted successfully.'])[1]")).isDisplayed());

        //11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("//*[@class='fa fa-home']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='carousel-inner'])[1]")).isDisplayed());


    }
}
