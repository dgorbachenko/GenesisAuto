package lesson8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author dgorbachenko
 */
public class TestNgDataProvider {
    @DataProvider
    public Object[][] emails(){
        return new Object[][]{
                {"Jack.com", " qwe"},
                {"Jacks.com", " gwe"},
                {"Jacks.com", " qwe"},
        };

    }
    @Test(dataProvider = "emails")
    public void emailValidation (String email, String password){
        System.out.print(email);
        System.out.println(password);

    }
}
