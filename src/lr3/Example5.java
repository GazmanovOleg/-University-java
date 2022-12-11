package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число:");
        int num = in.nextInt();
        int [] mas = new int [num];

        /*int i = 0;
        int j = 1;
        while (i<num){
            if (j%5 ==2 && j%3==1){
                mas[i]=j;
                i++;
            }
            j++;

        }*/
        mas[0] = 7;
        for(int i = 1; i<num;i++){
            mas[i]=mas[i-1]+15;
        }

        for(int b:mas){
            System.out.print(" "+b+" ");
        }


    }
}
