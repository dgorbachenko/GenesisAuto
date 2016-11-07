package lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by gdv on 29.09.2016.
 */
public class AutorizationForFacebook {
    @Test
    public void outputInTheConsolTitle () throws InterruptedException {
        WebDriver driver = new ChromeDriver(); // open browser

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );// ожидание елемента
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// ожидание страници

        driver.get("https://www.facebook.com/"); // open url

        driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("dima3221@ukr.net"); //input invalid email
        driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("test"); // input invalid pass
        driver.findElement(By.xpath(".//*[@id='u_0_l']")).click();

        String title = driver.getTitle(); //get the title of page
        System.out.println(title);

        driver.close();
    }
}
