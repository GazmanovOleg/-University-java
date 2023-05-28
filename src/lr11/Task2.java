package lr11;

import java.util.Scanner;

public class Task2 {
    public static String bin(String x){
        if (Integer.parseInt(x) <=1){
            return x;
        }
        else {
            return Integer.toString(Integer.parseInt(x)%2)+ bin(Integer.toString(Integer.parseInt(x)/2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        String x = sc.nextLine();
        System.out.println(new StringBuilder(bin(x)).reverse());

    }
}
