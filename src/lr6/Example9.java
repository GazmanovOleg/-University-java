package lr6;

public class Example9 {
    static char[] func(char [] mas){
        for (int i =0; i<(int)(mas.length/2); i++){
            char a = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = a;
        }
        return mas;
    }

    public static void main(String[] args) {
        char [] ded = {'q','a','s','e','v'};

        System.out.println(func(ded));
    }
}
