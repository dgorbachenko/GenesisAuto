package lesson9.packageExtends;

import org.testng.annotations.Test;

/**
 * @author dgorbachenko
 */
public class TestExtendExample {
    @Test
    public void tryIt() {
        Parent parent = new Parent();
        Child child = new Child();
        parent.makeSomeNoise();
        System.out.println("______");
        child.makeSomeNoise();
}
    @Test
    public void tryParentChild(){
        Parent child = new Child();
        child.makeSomeNoise();
    }

}
