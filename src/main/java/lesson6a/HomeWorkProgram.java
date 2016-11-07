package lesson6a;

/**
 * @author dgorbachenko
 */
public class HomeWorkProgram {
    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "teST";
        if (str1.equals(str2))
            System.out.println("Сравнениние на равенство:True");
        else
            System.out.println("Сравнениние на равенство:False");

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Сравнение без учета регистра:True");
        }
    }


}
