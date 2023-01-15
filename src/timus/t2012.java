package timus;

import java.util.Scanner;

public class t2012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(45*(12-N)<=60*4){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
