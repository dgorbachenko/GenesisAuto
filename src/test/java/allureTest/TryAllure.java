package allureTest;

import lesson17.TryAllurePage;
import org.testng.annotations.Test;

/**
 * Created by gdv on 28.11.2016.
 */
public class TryAllure {
    @Test
    public void testAllure(){
        TryAllurePage allurePage = new TryAllurePage();
        allurePage.step1();
        allurePage.step2();
        allurePage.step3();
    }

}
