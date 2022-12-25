package lr5;
class Ex4{
    char symbol;
    int num;
    Ex4(int num, char symbol){
        this.num = num;
        this.symbol = symbol;
    }
    Ex4(double dNum){
        this.symbol = (char) (int)dNum;
        this.num = (int) ((dNum - (int) dNum)*100);
    }

}
public class Example4 {
    public static void main(String[] args) {
        Ex4 example1 = new Ex4(65.1267);
        System.out.println(example1.symbol);
        System.out.println(example1.num);
    }
}
