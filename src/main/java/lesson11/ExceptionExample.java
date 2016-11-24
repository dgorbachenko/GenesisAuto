package lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author dgorbachenko
 */
public class ExceptionExample {

    WebDriver driver;
    @Test
    public void mathExaption(){
        int res = 5/0;
        System.out.println(res);
    }

    public void sleep(int millis)  {
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){

        }
        }


    @Test
    public void test (){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://kismia.com");
        try {
            driver.findElement(By.cssSelector("aaadsad"));
        } catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Nety elementa");
        }

    }


    @Test
    public void checkExeption() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com.ua");

        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("JAck Sparoww");

        driver.findElement(By.name("btnG")).click();
        sleep(3000);
        List<WebElement>elements = driver.findElements(By.cssSelector(".srq .g"));
        int searchResults = elements.size();
        if ( searchResults > 8){
            System.out.println("Jack is more then 9");
        }
        System.out.println(searchResults);
    }
    @AfterTest
    public void down(){
        driver.close();
        driver.quit();
    }

}