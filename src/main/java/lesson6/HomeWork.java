package lesson6;

import java.util.Scanner;

/**
 * @author dgorbachenko
 */
public class HomeWork {
    public static void main(String[] args) {
        String myString = "иууу";
        String mySecString = new StringBuffer(myString).reverse().toString();
        System.out.println(myString);
        System.out.println(mySecString);
        if (myString.equals(mySecString)) {
            System.out.println("Палиндромы");
        }
        else {
            System.out.println("NEt");
        }


    }
}

