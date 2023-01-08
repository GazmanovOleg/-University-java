package lr6;

public class Example5 {
    static int sumSquare(int num){
        int res = 0;
        for (int i = 1; i<=num; i++){
            res+=i*i;
        }
        return res;

    }
    static int sumSquareRec(int num){
        if (num == 1){
            return 1;
        } else{
            return num*num+sumSquareRec(num - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(sumSquare(4));
        System.out.println(sumSquareRec(4));
    }
}
