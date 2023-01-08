package lr6;
class Example1_1{
    public String txt;
    public char symbol;
    void setVal(char symbol){
        this.symbol = symbol;
    }
    public void setVal(String txt){
        this.txt = txt;
    }
    public void setVal(char [] mas){
        if (mas.length == 1){
            this.symbol = mas[0];
        } else if (mas.length > 1) {
            txt = "";
            for (char ma : mas) {
                txt = txt + ma;
            }
        }
    }

}
public class Example1 {
    public static void main(String[] args) {
        Example1_1 ex = new Example1_1();
        ex.setVal("sdf");
        System.out.println(ex.symbol);
        System.out.println(ex.txt);
        ex.setVal('f');
        System.out.println(ex.symbol);
        System.out.println(ex.txt);
        char [] mas ={'d', 'e', 'd'};
        ex.setVal(mas);
        System.out.println(ex.symbol);
        System.out.println(ex.txt);

        char [] mas1 ={'d'};
        ex.setVal(mas1);
        System.out.println(ex.symbol);

    }

}
