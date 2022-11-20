package lr1;

import java.net.SocketOption;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию:");
        String last_name = in.nextLine();
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите отчество:");
        String middle_name = in.nextLine();

        System.out.println("Hello "+' '+last_name+' '+name+' '+middle_name);
    }
}
