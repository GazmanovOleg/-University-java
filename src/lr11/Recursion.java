package lr11;

public class Recursion {
    private static int step = 0;
    public static void m(int x){
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20 ){
            m(2 * x + 1);
        }
    }
    public static void reverse_m(int x){
        if ((2 * x + 1) < 20 ){
            reverse_m(2 * x + 1);
        }
        System.out.println("r_x=" + x);
    }

    public static void example3_m(int x){
        space();
        System.out.println("" + x + "-> ");
        step++;
        if (( 2 * x + 1) < 20){
            example3_m(2 * x + 1);
        }
        step --;
        space();
        System.out.println("" + x + " <-");
    }
    public static void space(){
        for (int i = 0; i < step; i++){
            System.out.println(" ");
        }
    }

    public static int fact(int n){
        int result;
        if (n == 1) return 1;
        else {
            result = fact(n-1) * n;
            return result;
        }
    }
    public static int fact2(int n){

        if(n == 0){
            return 0;
        } else if (n==1){
            return 1;
        } else{
            return fact(n-2)+fact(n-1);
        }
    }
    public static void main(String[] args) {
        m(1);
        reverse_m(1);
        example3_m(1);
        System.out.println(fact(5));
        System.out.println("------");
        System.out.println(fact2(5));

    }

}
