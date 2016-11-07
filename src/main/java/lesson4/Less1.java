package lesson4;

/**
 * @author dgorbachenko
 */
public class Less1 {
    public static void main(String[] args) {
        char mychar[] = {'a'};
        int myint[] = {1, 3, 4};
        System.out.println(mychar);
        System.out.println(myint);
        // массивы лучше выводить через for
        for (int i = 0; i < mychar.length; i++) {
            System.out.print(mychar[i] + " ");
        }
    }
}
