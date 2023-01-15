package timus;

import java.util.Scanner;

public class t1877 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lock1 = sc.nextInt();
        int lock2 = sc.nextInt();
        String answesr = (lock1%2==0 || lock2%2!=0)?"yes":"no";
        System.out.println(answesr);
    }
}
