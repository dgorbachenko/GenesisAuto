package lesson10;

/**
 * @author dgorbachenko
 */
public class ExampleSB {
    public static void main(String[] args) {
        ExampleSB output = new ExampleSB();
        int count = 100;
        for (int i = 0; i < count; i++) {
            output.append("Some text");
            System.out.println();
        }
    }

    private void append(String s) {
    }
}