package lesson2;

import java.util.Scanner;

/**
 * @author dgorbachenko
 */
public class ReadFromConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something : ");
        String input = scanner.nextLine();

        System.out.println(input);
    }
}

