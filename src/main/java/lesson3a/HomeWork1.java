package lesson3a;

/**
 * @author dgorbachenko
 */

public class HomeWork1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = 3;
        int d = 4;
        int result = a;

        if (result > b){
            result = b;
        }
        if (result > c){
            result = c;
        }
        if (result > d){
            result = d;
        }
        System.out.println(result);
    }
}
