package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.mustache.StringChunk;
import pageObject.Constants;
import pageObject.MainPage;

import java.util.concurrent.TimeUnit;

/**
 * @author dgorbachenko
 */
public class LoginKismia {

        WebDriver driver;
        String email = "Vika.smile1993@mail.ru";
        String password = "1234";

        @BeforeTest
        public void setUpBrowser() {
            System.out.println("SetUp Chrome");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_LONG_TIME, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @Test
        @Parameters ({"email", "password"})
        public void loginKs(String email, String password){
            System.out.println(email);
            System.out.println(password);
        }

        public void trySelenium() throws InterruptedException {
            System.out.println("TEST");
            driver.get("https://kismia.com");

            MainPage mainPage = new MainPage(driver);
            mainPage.login(email, password);
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.urlContains("u17121788"));
            //isUrlContains("u17121788", 10);
            String currentUrl = driver.getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("u17121788"));

        }
        @AfterTest
        public void tearDown() {
            System.out.println("tearDown");
            driver.close();
            driver.quit();
        }
    }
////        public boolean isUrlContains(AboutString urlPart, int seconds) throws InterruptedException {
////            for (int i = 0; i < seconds * 10; i++) {
////                if (driver.getCurrentUrl().contains(urlPart)) {
////                    return true;
////                }
////                System.out.println("ERROR//// try again");
////                Thread.sleep(100);
////            }
////            return false;
//        }


