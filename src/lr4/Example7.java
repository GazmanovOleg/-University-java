package lr4;

import java.util.Random;

public class Example7 {
    public static void main(String[] args) {
        int masSize = 6;
        int [][] mas = new int[masSize][masSize];

        for(int i = 0;i<masSize; i++){
            if (i%2==0){
                for(int j=masSize*i; j<masSize*i+masSize;j++){
                    mas[i%6][j%6] = j;
                    System.out.print(" "+mas[i%6][j%6]+" ");

                }
            }
            else{
                for(int j=masSize*i+masSize-1; j>masSize*i-1;j--){
                    mas[j%6][i%6] = j;
                    System.out.print(" "+  mas[j%6][i%6]+" ");
            }
            }
            System.out.println();
        }










    }
}
