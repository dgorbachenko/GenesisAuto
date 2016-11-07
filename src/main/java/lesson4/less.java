package lesson4;

/**
 * @author dgorbachenko
 */
public class less {
    public static void main(String[] args) {
        int ar []= {2,3,-1,6,6,6,7,8,9,0,1111};
        int min = ar[0];
        int max = ar[0];
        for (int i : ar){
            if (i>max)
                max = i;
            if (i<min)
                min=1;
        }
        System.out.println(min);
        System.out.println(max);

    }
}
