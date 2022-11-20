package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год рождения:");
        int years = in.nextInt();
        System.out.println("Вам "+(2022-years)+" лет.");
    }
}
