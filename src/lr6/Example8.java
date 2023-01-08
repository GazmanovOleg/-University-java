package lr6;

import java.util.Arrays;

public class Example8 {
    static int func(int [] mas){
        return Arrays.stream(mas).sum()/mas.length;
    }

    public static void main(String[] args) {
       int [] mas = {1,2,3,4,5};
       System.out.println(func(mas));
    }
}
