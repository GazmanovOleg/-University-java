package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число 1 и число 2:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int min = (num1 < num2) ? num1 : num2;
        int max = (num1 > num2) ? num1 : num2;

        /*for(int i = min; i<max+1;i++){
            System.out.println(i);
        }*/


        while (min<max+1){
            System.out.println(min);
            min++;
        }

    }
}
