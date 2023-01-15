package lr6;

public class Example4 {
    int sum;
    static int factorial(int num){
        int sum1 = 1;
        for(int i = num; i>0; i-=2){
            sum1*= i;
        }
        return sum1;
    }
    static int factorialRec(int num){
        if (num == 2 || num == 1){
            return num;
        }
        else{
            return num*factorialRec(num-2);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(6));
        System.out.println(factorialRec(6));
    }
}
