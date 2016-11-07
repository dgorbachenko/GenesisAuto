package lesson9.packageExtends;

/**
 * @author dgorbachenko
 */
public class Parent {
    public Parent(){
        this.name = name;
        this.birthData = birthData;

    }

    public String name = "Davakin";
    public String birthData = "10.02.09";

    public void makeSomeNoise(){
        System.out.println("FI-DA");
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(5000);
    }


}
