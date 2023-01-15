package lr6;

import java.util.Arrays;

public class Example7 {
    static int [] func(char [] mas){
        int [] newMas = new int[mas.length];
        for(int i=0; i<mas.length; i++){
            newMas[i] = (int)mas[i];
        }
        return newMas;
    }

    public static void main(String[] args) {
        char [] mas = {'a','b','c'};
        System.out.println(Arrays.toString(func(mas)));
    }
}
