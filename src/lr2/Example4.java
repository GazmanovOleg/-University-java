package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        System.out.println(5<=n & n<=10? "Крутое число": "Так себе число");
    }
}
