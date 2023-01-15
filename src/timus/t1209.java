package timus;

import java.util.Scanner;

public class t1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (long i =0; i<n; i++){
            long x = sc.nextLong() - 1;
            long y = (long) Math.sqrt(8*x+1);
            if(y*y ==(8*x+1)){
                System.out.println("1 ");
            } else {
                System.out.println("0 ");
            }
        }
    }
}
