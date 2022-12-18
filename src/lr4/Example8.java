package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования:");
        String text = in.nextLine();
        System.out.println();
        System.out.print("Введите ключ:");
        int key = in.nextInt();
        char[] mas = text.toCharArray();
        for (int i =0; i< mas.length;i++){
            mas[i] = (char) (mas[i]+key);
        }
        System.out.println();
        String encryptString = new String (mas);
        System.out.print("Текст после преобразования:"+encryptString);
        System.out.println();
        System.out.println("Выполнить обратное преобразование? (y/n)");

        String Answer = in.nextLine();


        if (!(Answer.equals("y")) && !(Answer.equals("n"))){
            while (!(Answer.equals("y")) && !(Answer.equals("n"))){
                    System.out.println("«Введите корректный ответ:");
                    Answer = in.nextLine();
                }
            }

        if (Answer.equals("y")){
            for (int i =0; i< mas.length;i++){
                mas[i] = (char) (mas[i]-key);
            }
                encryptString = new String (mas);
                System.out.println(encryptString);
            }else {
                System.out.println("«До свидания!");
            }



    }
}
