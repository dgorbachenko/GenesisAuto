package lesson4;

import java.util.Arrays;

/**
 * @author dgorbachenko
 * /n
 */
public class ArraysMetods {
    public static void main(String[] args) {
        int someArrays [] = {1,6,3,4,5};
        Arrays.sort(someArrays);
        System.out.println("Sorted array:" + Arrays.toString(someArrays));
        System.out.println("Blala:\n"+Arrays.toString(someArrays));
    }
}
