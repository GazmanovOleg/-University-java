package timus;

import java.util.Scanner;

public class t1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        if (n>0){
            for(int i = 1;i<=n;i++){
                sum+=i;
            }
        }
        else{
            for(int i = 1;n<=i;i--){
                sum+=i;
            }

        }
        System.out.println(sum);
    }
}
