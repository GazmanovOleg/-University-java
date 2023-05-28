package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example7 {

    /*Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые имеют длину больше заданного значения.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "Напишите функцию которая принимает на вход список строк и возвращает новый список содержащий только те строки которые имеют длину больше заданного значения";
        List<String> strings = List.of(string.split(" "));

        System.out.println("Введите число:");
        int num = sc.nextInt();

        List<String> stringsAfter = LenStringFilter(strings, num);
        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> LenStringFilter(List<String> list, int num){
        return list.stream()
                .filter(s -> s.length()>num)
                .collect(Collectors.toList());
    }

}
