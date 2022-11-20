package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        int r = (a-1+a+a+1);
        System.out.print(a-1+" "+a+" "+(a+1)+" "+r*r);
    }
}
