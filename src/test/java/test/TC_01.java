package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class TC_01 {
    @Test
    public void test01() {
        //1. Launch browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

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
        //WebElement name = driver.findElement(By.xpath("//*[@name=\"name\"]"));

        //WebElement email = driver.findElement(By.xpath("(//*[@name='email'])[2]"));
        WebElement email = driver.findElement(By.xpath("(//*[@name='email'])[1]"));
        email.sendKeys("jhonaltusthail@gmail.com");
        WebElement password2 = driver.findElement(By.xpath("//*[@name='password']"));
        password2.sendKeys("polonya01");

        //7. Click 'Signup' button
        WebElement logIn = driver.findElement(By.xpath("//*[text()='Login']"));
        logIn.click();
        //WebElement signUp = driver.findElement(By.xpath("//*[text()='Signup']"));
        //signUp.click();

        /*//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement text = driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        Assert.assertTrue(text.isDisplayed());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        WebElement title = driver.findElement(By.xpath("//*[@id='id_gender1']"));
        title.click();
        WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("polonya01");

        WebElement dayDDM = driver.findElement(By.xpath("//*[@id='days']"));
        dayDDM.sendKeys("2");
        WebElement monthDDM = driver.findElement(By.xpath("//*[@id='months']"));
        dayDDM.sendKeys("2");
        WebElement yearDDM = driver.findElement(By.xpath("//*[@id='years']"));
        dayDDM.sendKeys("1990");

        //10. Select checkbox1 'Sign up for our newsletter!'
        WebElement checkBox =  driver.findElement(By.xpath("//*[@id='newsletter']"));
        checkBox.click();

        //11. Select checkbox 'Receive special offers from our partners!'
        WebElement checkBox2 = driver.findElement(By.xpath("//*[@id='optin']"));
        checkBox2.click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        Actions actions = new Actions(driver);
        WebElement firstName =  driver.findElement(By.xpath("//*[@id='first_name']"));
        firstName.sendKeys("Jhon");
        actions.click(firstName).sendKeys("Jhon").
                sendKeys(Keys.TAB).sendKeys("Altis").
                sendKeys(Keys.TAB).sendKeys("atlantik").
                sendKeys(Keys.TAB).sendKeys("New york, Balbenue Avenue").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("USA").
                sendKeys(Keys.TAB).sendKeys("New York").
                sendKeys(Keys.TAB).sendKeys("Balbenue").
                sendKeys(Keys.TAB).sendKeys("15456").
                sendKeys(Keys.TAB).sendKeys("123-456-789");


        WebElement lastName =  driver.findElement(By.xpath("//*[@id='last_name']"));
        lastName.sendKeys("atlan");
        WebElement company =  driver.findElement(By.xpath("//*[@id='company']"));
        company.sendKeys("Atlantik");
        WebElement address1 =  driver.findElement(By.xpath("//*[@id='address1']"));
        address1.sendKeys("New york, Balbenue Avenue");
        WebElement address2 =  driver.findElement(By.xpath("//*[@id='address2']"));
        address2.sendKeys("Chicago, Gangsta Street");
        WebElement country =  driver.findElement(By.xpath("//*[@id='country']"));
        country.sendKeys("United State");
        WebElement state =  driver.findElement(By.xpath("//*[@id='state']"));
        state.sendKeys("New York");
        WebElement city =  driver.findElement(By.xpath("//*[@id='city']"));
        city.sendKeys("Bali");
        WebElement zipcode =  driver.findElement(By.xpath("//*[@id='zipcode']"));
        zipcode.sendKeys("123546");
        WebElement number =  driver.findElement(By.xpath("//*[@id='mobile_number']"));
        number.sendKeys("123-465-789");


        //13. Click 'Create Account button'
        WebElement createAccount = driver.findElement(By.xpath("//*[text()='Create Account']"));
        createAccount.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible
        WebElement text2 = driver.findElement(By.xpath("//*[text()='Account Created!']"));
        Assert.assertTrue(text2.isDisplayed());

        //15. Click 'Continue' button
        WebElement continueButton = driver.findElement(By.xpath("//*[text()='Continue']"));
        continueButton.click();*/

        //16. Verify that 'Logged in as username' is visible
        WebElement usernameVisible = driver.findElement(By.xpath(" //*[text()=' Logged in as ']"));
        Assert.assertTrue(usernameVisible.isDisplayed());

        //17. Click 'Delete Account' button
        WebElement deleteButton = driver.findElement(By.xpath("//*[text()=' Delete Account']"));
        deleteButton.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(driver.findElement(By.xpath("(//*[text()='Delete Account'])[2]")).isDisplayed());

    }
}
