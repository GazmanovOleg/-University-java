package lr6;

import java.util.Arrays;

class Example3_3{
    public static void getNums(int ... nums){
        System.out.println(Arrays.stream(nums).max());
        System.out.println(Arrays.stream(nums).min());
        System.out.println(Arrays.stream(nums).average());

    }

}

public class Example3 {
    public static void main(String[] args) {
        int [] mas = {1,2,3,4};
        Example3_3.getNums(mas);
    }
}
