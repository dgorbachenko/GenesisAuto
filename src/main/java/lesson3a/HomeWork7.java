package lesson3a;

import java.util.Scanner;

/**
 * @author dgorbachenko
 */
public class HomeWork7 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        switch (input) {

            case "June":
                System.out.println("6");
                break;
            case "December":
                System.out.println("12");
        }
    }
}



