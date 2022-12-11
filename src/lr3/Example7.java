package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int masLen = 10;
        int letter = 97;
        char [] mas = new char[masLen];
        for (int i = 0;i<10;i++){
            mas[i] = (char) letter;
            letter+=2;
        }

        for(char b:mas){
            System.out.print(b);
        }
        System.out.println();

        for(int i = masLen-1; i >= 0; i--){
            System.out.print(mas[i]);
        }
    }
}
