package lesson8;

import org.testng.annotations.Test;

/**
 * @author dgorbachenko
 */
public class TestNgTestMetods {
    @Test(priority = 3)
    public void aTest(){
        System.out.println("a test");

    }
    @Test(priority = 2, invocationCount = 100)
    public void bTest(){
        System.out.println("b test");

    }
    @Test(priority = 1)
    public void cTest(){
        System.out.println("c test");

    }
    @Test(priority = 4)
    public void noTest(){
        System.out.println("no test");

    }

}
