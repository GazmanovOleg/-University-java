package lr6;

import java.util.Arrays;

public class Example10 {
 public static  int []  func(int ... nums){
     int max = nums[0];
     int min = nums[0];
        for(int i = 1; i<nums.length; i++){
            if (nums[i]>max){
                max = nums[i];
            } else if (nums[i]<min) {
                min = nums[i];
            }
        }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(func(1, 2, 3, 4, 5, 6)));
    }


}
