package lesson6;

import javax.jws.soap.SOAPBinding;

/**
 * @author dgorbachenko
 */
public class LessUser {

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        user1.name = "Muhsa";
        user1.age = 25;
        user2.name= "Jack";
        user2.age = 20;
        user1.city = "kiev";
        user3.age = 30;

        System.out.println(User.type);

    }
}

