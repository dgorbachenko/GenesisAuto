package lesson17;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by gdv on 28.11.2016.
 */
public class TryAllurePage {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test1() {
        step1();
        step2();
        step3();
    }

    @Step
    public void step1() {
        logger.info("step1 ok");
    }
    @Step
    public void step2() {
        logger.info("step2 ok");
    }
    @Step
    public void step3() {
        logger.info("step3 ok");
    }
}
