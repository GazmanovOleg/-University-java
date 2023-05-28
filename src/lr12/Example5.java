package lr12;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example5 {

    /*Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые содержат заданную подстроку.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые содержат заданную подстроку.";
        List<String> strings = List.of(string.split(" "));

        System.out.println("Введите подстроку:");
        String substring = sc.nextLine();

        List<String> stringsAfter = SubstringFilter(strings, substring);
        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }
    }

    public static List<String> SubstringFilter(List<String> list, String substring){
        return list.stream()
                .filter(s -> s.contains(substring) )
                .collect(Collectors.toList());
    }

}
