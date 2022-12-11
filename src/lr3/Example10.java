package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);


        System.out.print("Введите размер массива:");
        int size = id.nextInt();

        int [] nums = new int[size];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);

            System.out.print(" " + nums[i] + " ");
        }
        for (int i = 0 ; i < nums.length ; i++ ){
            for (int j = 0 ; j+1 < nums.length ; j++ ){
                if (nums[i]>nums[j]){
                    int c = nums[i];
                    nums[i] = nums[j];
                    nums[j] = c;
                }
            }
        }
        System.out.println();
        System.out.println("Произведена сортировка массива");

        for (int b : nums){
            System.out.print(" " + b + " ");

        }
    }

}
