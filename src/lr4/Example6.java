package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int [][] lst = new int[7][7];
        Random random = new Random();
        int row = random.nextInt(6);
        int column = random.nextInt(6);
        int [] mas = new int[6*6];
        int n = 0;
        for (int i = 0; i<7;i++){
            for(int j = 0; j<7;j++){
                lst[i][j] = random.nextInt(20);
                if (i!=row && j!=column){
                    mas[n] = lst[i][j];
                    n++;
                }
                System.out.print(lst[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("row="+row+" column="+column);

        System.out.println();
        n = 0;
        int [][] new_lst = new int[6][6];
        for (int i = 0; i<6;i++){
            for(int j = 0; j<6;j++){
                new_lst[i][j] = mas[n];
                n++;
                System.out.print(new_lst[i][j]+" ");
                }
            System.out.println();
            }
        }
}





