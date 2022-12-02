package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        System.out.println(n%5==2 & n%7==1? "Крутое число": "Так себе число");
    }
}
