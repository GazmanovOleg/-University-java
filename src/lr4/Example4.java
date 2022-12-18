package lr4;

public class Example4 {
    public static void main(String[] args) {
        char [][] mas = {{'+'},{'+','+'},{'+','+','+'},{'+','+','+','+'}};
        for(int i=0; i<4; i++){

            for(int j=0; j<i+1; j++){
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
}
