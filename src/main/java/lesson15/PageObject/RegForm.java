package lesson15.PageObject;

import lesson6.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by gdv on 21.11.2016.
 */
public class RegForm {

    WebDriver driver;
    public Login loginForm;
    public RegForm(WebDriver driver) {
        this.driver = driver;
        loginForm = new Login(driver);
    }
    private By regTab = By.cssSelector("#form-registration");
    private By genderMale = By.cssSelector("label[for='iam-boy");
    private By genderFemale = By.className("label[for='iam-girl");
    public void clickRegTab() {
        driver.findElement(regTab).click();
    }
    public void selectGender(char gender) {
        if (gender == 'm') {
            driver.findElement(genderMale).click();
        } else {
            driver.findElement(genderFemale).click();
        }
    }
    public void regNameUser(User user) {
        clickRegTab();
        selectGender(user.gender);
    }
    public class Login {
        WebDriver driver;
        public  Login(WebDriver driver) {
            this.driver = driver;
        }
        By userEmail = By.cssSelector("");
        By userPassword = By.cssSelector("");
        By submitBtn = By.cssSelector("");
        public void login(User user){
            driver.findElement(userEmail).clear();
            driver.findElement(userEmail).sendKeys(user.email);
            driver.findElement(userPassword).clear();
            driver.findElement(userPassword).sendKeys(user.password);
            driver.findElement(submitBtn).click();
        }

    }
}
