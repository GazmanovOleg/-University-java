package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Напишите функцию, которая принимает на вход список целых чисел и возвращает новый список,
        содержащий только те числа, которые делятся на заданное число без остатка.*/

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for(int i =0 ; i<10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        System.out.println("Введите делитель:");
        int num = sc.nextInt();
        List<Integer> integersAfter = zeroRemainder(integers, num);
        System.out.println("\n" + "Числа, которые делятся на заданный делитель без остатка: " + "\n");

        for(Integer i: integersAfter){
            System.out.println(i);
        }
    }

    public static List<Integer> zeroRemainder(List<Integer> list, int num){
        return list.stream().toList().stream().filter(x -> x%num==0).collect(Collectors.toList());
    }
}
