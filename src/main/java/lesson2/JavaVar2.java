package lesson2;

/**
 * Created by gdv on 30.09.2016.
 */
public class JavaVar2 {
    public static void main (String[] args){
        int i = 605233;
        long lo = i;
        short s = (short) lo;

        System.out.println(s);

        char ch='a';
        int ina = (int)ch;
        System.out.println(ina);

        // Приведение Типов
        double b = 2.6;
        int c = (int) (0.5 + b ); //
        System.out.println(c); // выведет 3
        System.out.println((int)9.69);// выведет 9
        System.out.println((int)'A');// выведет 65 - код символа "А"

        //Классы оболочки
        Integer d = new Integer(100);
      //  Character c = new Character('c');

        // Привидение типов (Классі оболочки)
        int xInt;
        Float x = new Float("2.421");
        xInt = x.intValue();


    }
}
