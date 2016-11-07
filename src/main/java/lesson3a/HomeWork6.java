package lesson3a;

/**
 * @author dgorbachenko
 */
public class HomeWork6 {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = 3;
        int t = 4;
        if (a < b &&  a < c && a < t) {
          System.out.println(a + " a найменьшое число");
            int sum = b + c + t;
            System.out.println(sum + " sum ");
       }
      else if (b < a && b < c && b < t ) {
            System.out.println(b + "a найменьшое число");
            int sum = a + c + t;
            System.out.println(sum + " sum ");
        }
        else if (c < a && c < b && c < t){
            System.out.println(c + "c найменьшое число");
            int sum = b + a + t;
            System.out.println(sum + " sum ");
        }
        else if (t < a && t < b && t < c ){
            System.out.println(t + "a найменьшое число");
            int sum = b + c + a;
            System.out.println(sum + " sum ");
        }
        else {
            System.out.println("test");
        }



    }
}
