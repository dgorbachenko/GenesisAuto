package lesson6a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author dgorbachenko
 */
public class SileniumBanks {
    WebDriver driver;

    @BeforeTest
    public void SetUpDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void BankPrivat24() throws InterruptedException {
        driver.get("https://www.privat24.ua");
        String money = driver.findElement(By.cssSelector(".section-content.rate")).getText();

            try {
                Double d2 = Double.valueOf(money);
                System.out.println(d2);
            } catch (NumberFormatException e) {
                System.err.println("Неверный формат строки!");
            }
        System.out.println(money);



    }
}