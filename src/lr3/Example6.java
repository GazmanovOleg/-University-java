package lr3;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        if(in.hasNextInt()){
            int num = in.nextInt();
            if (num>0) {
                int[] mas = new int[num];

                mas[0] = 2;
                for (int i = 1; i < num; i++) {
                    mas[i] = mas[i - 1] + 5;
                }

                for (int b : mas)
                    System.out.println(b);
            } else {
                System.out.println("Введите число больше 0");
            }

        } else {
            System.out.println("Неправильный ввод");
        }


    }
}
