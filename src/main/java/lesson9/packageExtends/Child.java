package lesson9.packageExtends;

/**
 * @author dgorbachenko
 */
public class Child extends Parent {
    public Child(){
        super();
    }
    public void cry(){
        makeSomeNoise();
        name = "Sparoww";
    }
    @Override // переписываем парент метод, this - определение этого класа в котором мы находимся
    public void makeSomeNoise(){
        super.makeSomeNoise();// супер -определения класа родителя
        System.out.println("lalalal");

    }
    public void pee(){

    }
}
