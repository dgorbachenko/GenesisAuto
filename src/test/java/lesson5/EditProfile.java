package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Constants;
import pageObject.MainPage;
import pageObject.ProfilePage;

import java.util.concurrent.TimeUnit;

/**
 * @author dgorbachenko
 */
public class EditProfile {
    WebDriver driver;
    String email = "dima322@ukr.net";
    String password = "123456";
    @BeforeTest
    public void setUpBrowser(){
        System.out.println("Na4alos");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_LONG_TIME, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test
    public void EditProfile () throws InterruptedException {
        System.out.println("Login4eg");
        driver.get("https://kismia.com");

        MainPage mainPage = new MainPage(driver);
        mainPage.login(email, password);

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.clickEditButton();

        profilePage.clickDropDownEducation();// изменияем профиль образования
        profilePage.clickSaveButton();// сохраняем профайл
        profilePage.assertAll("123", profilePage.valueWebEducation );


//        AboutString currentText = driver.toString();
//        Assert.assertTrue(currentText.contains("более одного высшего"));

    }



//    @AfterTest
//    public void tearDown() {
//        System.out.println("Good bye");
//        driver.close();
//        driver.quit();
//    }

    }

