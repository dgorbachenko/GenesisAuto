package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author dgorbachenko
 */
public class ProfilePage {
    private WebDriver driver;
//
//    public ProfilePage(WebDriver driver){
//        this.driver = driver;
//    }
    public ProfilePage (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public void clickEditButton (){
        driver.findElement(By.xpath(".//*[@id='user_info_edit']")).click();
    }
    public void clickDropDownEducation (){
        driver.findElement(By.xpath(".//*[@id='user_info']/table/tbody/tr[1]/td/select/option[5]")).click();
    }
    public void clickSaveButton(){
        driver.findElement(By.xpath(".//*[@id='user_info_save']")).click();
    }

    public void assertAll(String expectedError, WebElement element) {
        String errorFieldText = element.getText();
        if (!errorFieldText.contains(expectedError)) {
            String errorMessage = String.format(
                    "Expected result: %s , not found. Actual error: %s",
                    expectedError,
                    errorFieldText);
            throw new AssertionError(errorMessage);
        }
    }
    @FindBy(xpath = ".//*[@id='user_info']/table/tbody/tr[1]/td")
    public WebElement valueWebEducation;


}
