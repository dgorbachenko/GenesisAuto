package lesson4;

/**
 * @author dgorbachenko
 */
public class ArraysForEach {
    public static void main(String[] args) {
        int intArray [] = {1,2,3};
        intArray [0] = 1;
        intArray [1] = 2;
        intArray [2] = 3;
        for (int arrElement:intArray ){
            System.out.println(arrElement);
        }
    }
}
