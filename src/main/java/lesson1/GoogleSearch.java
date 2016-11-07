package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by gdv on 26.09.2016.
 */
public class GoogleSearch {
    String mySearchWords = "Hello, world";
    @Test
    public void findSomeWord() throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        driver.get("https://www.google.com.ua");

        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys(mySearchWords);

        driver.findElement(By.name("btnG")).click();

        Thread.sleep(3000);

        String title  = driver.getTitle();
        System.out.println(title);

        driver.close();
        driver.quit();
    }
}
