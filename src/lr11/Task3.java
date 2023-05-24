package lr11;

import java.util.Scanner;

public class Task3 {
    public static int input(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }


    public static void inp_mass(int n, int i, int [] mas){
        if (i<=n-1){
            mas[i] = input();
            inp_mass(n,i+1, mas);
        }
    }

    public static void out_mass(int n, int i, int [] mas){
        if (i<=n-1){
            System.out.println(mas[i]);
            out_mass(n,i+1, mas);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество числел:");
        int n = sc.nextInt();
        int [] mas = new int[n];
        inp_mass(n,0,mas);
        out_mass(n,0,mas);

    }
}
