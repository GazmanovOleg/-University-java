package lr6;

import java.util.Arrays;

public class Example6 {
    static int[] mas1(int[] mas, int num){
        int [] m;
        if (mas.length >= num){
            m = Arrays.copyOfRange(mas, 0 , num);
        } else{
            m =  Arrays.copyOfRange(mas,0, mas.length);
        }
        return m;
    }

    public static void main(String[] args) {
       int [] mas = new int[]{1, 2, 3, 4, 5};
       int n = 7;

       System.out.print(Arrays.toString(mas1(mas, n)));
    }
}
