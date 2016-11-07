package lesson6a;

/**
 * @author dgorbachenko
 * Prevedenie tipov
 */
public class HomeWork1 {
    public static void main(String[] args) {

        int i = 35; // int to String
        String str = Integer.toString(i);
        System.out.println(str);

        double b = 234.1;
        String str1 = Double.toString(b);
        System.out.println(str1);

        long  c = 3422222;
        String str3 = Long.toString(c);
        System.out.println(str3);

           //String to int
       String str4 = "20349";
        try {
            Integer i1 = new Integer(str4);
            System.out.println(i1);
        }catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }
}
