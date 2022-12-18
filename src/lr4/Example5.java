package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int LenMas = 4;
        int [][] mas = new int [4][4];
        for (int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                Random random = new Random();
                mas[i][j] = random.nextInt(20);
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("________");
        int d = 0;
        for (int i = 0; i<4; i++){

            for(int j = d; j<LenMas; j++){
                int t = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = t;
            }
            d++;
        }

        for (int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }



    }
}
