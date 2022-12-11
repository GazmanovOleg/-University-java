package lr3;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int masLen = 10;
        String letters = "BCDFGHJKLM";
        char [] mas = new char[masLen];
        for (int i = 0;i<10;i++){
            mas[i] = letters.charAt(i);

        }

        for(char b:mas){
            System.out.print(b);
        }

    }
}
