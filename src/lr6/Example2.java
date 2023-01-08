package lr6;
class Example2_2{
    private static int num = 0;
    static void showNum(){
        System.out.println(num);
        num+=1;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Example2_2.showNum();
        Example2_2.showNum();
    }
}
