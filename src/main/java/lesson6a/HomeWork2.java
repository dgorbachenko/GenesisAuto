package lesson6a;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author dgorbachenko
 */
public class HomeWork2 {


    public static void main(String[] args) {

//        String line = "1 2 3 4 5 6 7";
//        String[] words = line.split(" ");
//        System.out.println("Через запятую: " + Arrays.toString(words));
        String[] auto = {"1", "2", "3"," " }; //задан массив строк
        String result = " "; //задана строка

        // прибавляем к строке элементы массива
        for(int i = 0; i < auto.length; i++){
            //если элемент не последний, разделяем запятой
            if(i != auto.length-1 )
                result += auto[i] + ", ";
        }
        System.out.print(result);
    }
}


