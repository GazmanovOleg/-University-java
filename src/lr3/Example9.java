package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int size = id.nextInt();

        int[] nums = new int[size];
        Random random = new Random();
        int min = 300;
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(20);
            if (nums[i]<min) min=nums[i];
            System.out.print(" " + nums[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < nums.length ; i++ ){

            if (nums[i]==min) {System.out.print(i + " ");};

        }




    }
}

