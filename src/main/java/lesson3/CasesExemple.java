package lesson3;

import java.util.Scanner;

/**
 * Created by gdv on 03.10.2016.
 */
public class CasesExemple {
    public static void main(String[] args) {


        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter somesing: ");
        int input = scaner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Jack");
                break;
            case 2:
                System.out.println("12");
                default:
                    System.out.println("blalbllbla");
        }

        if (input == 1 ) {
            System.out.println("jack");
        }
            else if (input == 2 ) {
            System.out.println();
        }
        else {
            System.out.println("blblwsllflfb");

        }
    }
}
