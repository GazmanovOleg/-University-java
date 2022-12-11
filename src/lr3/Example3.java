package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = in.nextInt();
        int [] a = new int [num];
        a[0]=1;
        a[1]=1;

        /* for(int i = 2; i<num;i++){
            a[i]=a[i-1]+a[i-2];
        }*/

        int i = 2;
        while (i<num){
            a[i] = a[i-1]+a[i-2];
            i++;
        }
        for(int b : a)
            System.out.println(b);

    }
}
