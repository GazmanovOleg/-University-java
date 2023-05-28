package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example9 {
    /*Напишите функцию, которая принимает на вход список строк и возвращает новый список,
     содержащий только те строки, которые содержат только буквы (без цифр и символов).*/
    public static void main(String[] args) {

        String string = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые содержат только буквы (без цифр и символов)";
        List<String> strings =  List.of(string.split(" "));

        List<String> stringsAfter = StringLettersOnly(strings);
        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }

    }
    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[а-яА-ЯёЁ]*$");
    }
    public static List<String> StringLettersOnly(List<String> list){
        return list.stream()
                .filter(s -> isAlpha(s))
                .collect(Collectors.toList());
    }
}
