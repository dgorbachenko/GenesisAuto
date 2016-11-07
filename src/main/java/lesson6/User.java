package lesson6;

/**
 * @author dgorbachenko
 */
public class User {
    public String name;
    public int age;
    public  String city;
    public char gender;

    public static String type = "Human";

    @Override
    public String toString(){
        return name+ ":"+ age+""+city+":"+gender;

    }

}
