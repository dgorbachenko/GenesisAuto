package lesson5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Constants;

import java.util.concurrent.TimeUnit;

/**
 * @author dgorbachenko
 */
public class Silenium {

    WebDriver driver;

@BeforeTest
    public void setUpDriver () {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_TIME,TimeUnit.SECONDS);// ожидание елемента
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// ожидание страници
        driver.manage().window().maximize();
    }

    @Test
    public void trySilenium() throws InterruptedException {
     setUpDriver();
        driver.get("https://www.facebook.com");
//        AboutString title = driver.getTitle();
//        System.out.println(title);

        Assert.assertEquals(driver.getTitle(), Constants.Facebook);
    }
    @AfterTest
    public void testDown(){
        driver.close();
        driver.quit();
    }
}
