package lr7;

public class Example5 {
    private String str;
    Example5(String str){
        this.str = str;
    }
    String getStr(){
        return str;
    }
    String classInfo(){
        return this.getClass().getSimpleName()+"\n"+this.str;
    }
}

class Example5_1 extends Example5{
    private int num;
    Example5_1(String str, int num) {
        super(str);
        this.num = num;
    }
    String classInfo(){
        return this.getClass().getSimpleName()+"\n"+this.num+"\n"+super.getStr();
    }
}
class Example5_2 extends Example5{
    private char letter;
    Example5_2(String str, char letter) {
        super(str);
        this.letter = letter;
    }
    String classInfo(){
        return this.getClass().getSimpleName()+"\n"+this.letter+"\n"+super.getStr();
    }
}
class Main{
    public static void main(String[] args) {
        Example5 ex = new Example5("Пример 1");
        Example5_1 ex1 = new Example5_1("Пример 2", 12);
        Example5_2 ex2 = new Example5_2("Пример 3", 'a');

        System.out.println(ex.classInfo());
        System.out.println(ex1.classInfo());
        System.out.println(ex2.classInfo());

        ex = new Example5_1("Пример 4", 12);
        System.out.println(ex.classInfo());
        ex =  new Example5_2("Пример 5", 'a');
        System.out.println(ex.classInfo());


    }
}