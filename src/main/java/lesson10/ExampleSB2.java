package lesson10;

/**
 * @author dgorbachenko
 */
public class ExampleSB2 {

    public static void main(String[] args) {
        String output = "Some text";
        int count = 100000;
        for (int i=0; i < count; i++){
            output = output + "Some text";
        }
        System.out.println(output);
    }


}
