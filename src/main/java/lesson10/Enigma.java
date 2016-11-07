package lesson10;

import java.util.Scanner;

/**
 * @author dgorbachenko
 */
public class Enigma {
    public static void main(String args[]) {
        System.out.println("Please enter string to encode");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Encoded string is " + stringEncode(scanner.nextLine()));
    }

    public static String stringEncode(String stringToEncode) {
        String plainText = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String cypherText = "QWERTYUIOPqwertyuiopASDFGHJKL 12345asdfghjklZXCVBNM6789zxcvbnm";
        StringBuilder stringBuilder = new StringBuilder(stringToEncode);
        String encodedString = "";
        for (int i = 0; i < stringBuilder.length(); i++) {
            for (int j = 0; j < plainText.length(); j++) {
                if (stringBuilder.charAt(i) == plainText.charAt(j)) {
                    stringBuilder.setCharAt(i, cypherText.charAt(j));
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }
}


