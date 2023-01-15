package timus;

import java.util.Scanner;

public class t1787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int cars = 0;
        for (int i = 0; i<n;i++){
            int x = sc.nextInt();
            cars = cars+x - k;
            if(cars<0){
                cars = 0;
            }
        }
        System.out.println(cars);


    }
}