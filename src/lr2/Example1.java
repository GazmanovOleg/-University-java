package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        System.out.println(in.nextInt()%3==0? "Делится" : "Число не делится");
    }
}
