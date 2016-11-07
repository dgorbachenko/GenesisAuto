package lesson8_homework;

import org.testng.annotations.Test;

/**
 * @author dgorbachenko
 */
public class HomeWork_3 {

    @Test
    public void oneTest (){
        System.out.println("one");
    }
    @Test
    public void twoTest(){
        System.out.println("two");
    }
    @Test
    public void treeTest(){
        System.out.println("tree");
    }
    @Test(enabled = false)
    public void forTest(){
        System.out.println("for");
    }
    @Test
    public void fiveTest(){
        System.out.println("five");
    }
}
