package lesson6;

/**
 * @author dgorbachenko
 */
public class LessonArrays {
    public static void main(String[] args) {

        int[][] ars = new int[3][3];
        for (int i = 1; i < ars.length; i++) {
            for (int j = 0; j < ars[i].length; j++) {
                ars[i][j] = i + j;

            }
        }
        for (int i = 1; i < ars.length; i++) {
            for (int j = 0; j < ars[i].length; j++) {
                System.out.println(ars[i][j] + "");
            }
            System.out.println();// kakogo H

        }

    }
}

