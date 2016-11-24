package lesson6;

/**
 * @author dgorbachenko
 */
public class User {
    public String name;
    public int age;
    public  String city;
    public char gender;
    public String email;
    public String password;

    public static String type = "Human";

    public User(String email, String password) {

    }

    public User() {

    }

    @Override
    public String toString(){
        return name+ ":"+ age+""+city+":"+gender;

    }

}
