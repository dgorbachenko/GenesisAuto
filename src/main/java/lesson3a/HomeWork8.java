package lesson3a;

import org.apache.xpath.operations.String;

/**
 * @author dgorbachenko
 */
public class HomeWork8 {
    public static void main(String[] args) {
        //создаём переменную i1, по которой будет идти
        //внешний цикл
        int i1 = 1;
        while (i1<=10){
            int i2 = 1;
            while (i2<=10){
                System.out.print((i1 * i2) + " ");
                i2++;
            }
            System.out.println("");
            i1++;
        }

    }
}
