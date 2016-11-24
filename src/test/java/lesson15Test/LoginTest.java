package lesson15Test;

import lesson15.PageObject.RegForm;
import lesson6.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Constants;

import java.util.concurrent.TimeUnit;

/**
 * Created by gdv on 21.11.2016.
 */
public class LoginTest {
    WebDriver driver;
    User userForTest = new User("d.gorbachenko89@gmail.com", "gverty");
    @BeforeTest
    public void setUpBrowser () {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);// ожидание елемента
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// ожидание страници
        driver.manage().window().maximize();
    }
    @AfterTest
    public void teatDown(){
        driver.quit();
    }
    @Test
    public void loginUser(){
        RegForm regForm = new RegForm(driver);
        driver.get("https://kissmia.com");
        regForm.loginForm.login(userForTest);
        Assert.assertTrue(driver.findElement(By.cssSelector("[href='/sign/out']")).isDisplayed(),"Не залогинелся");

    }
}
