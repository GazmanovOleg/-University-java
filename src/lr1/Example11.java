package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите год рождения:");
        int years = in.nextInt();
        System.out.println(name+", "+(2022-years)+" лет.");
    }
}
