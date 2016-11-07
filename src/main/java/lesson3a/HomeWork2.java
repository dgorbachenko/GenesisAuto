package lesson3a;

    public class HomeWork2 {
        public static void main(String[] args) {
            int a = 6;
            int b = 2;
            int c = 8;
            int d = 4;
            int e = 1;
            int min = a;
            int max = a;
            if(min > b){
                min = b;
            }
            if ( min > c){
                min = c;
            }
            if ( min > d){
                min = d;
            }
            if (min > e){
                min = e;
            }
            if(max<b){
                max = b;
            }
            if (max < c){
                max = c;
            }
            if (max < d){
                max = d;
            }
            if (max< e){
                max = e;
            }
            System.out.println(min);
            System.out.println(max);

        }

    }
