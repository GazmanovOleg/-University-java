package timus;

import java.util.Scanner;

public class t2066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (b==0 ||  b==1 || c==1){
            System.out.println(a-b-c);
        }else {
            System.out.println(a-b*c);
        }

    }
}
