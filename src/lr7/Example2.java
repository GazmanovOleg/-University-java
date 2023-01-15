package lr7;
public class Example2 {
    Example2(String arg){
        this.name =arg;
    }
    private String name;
    void setValue(String name){
        this.name = name;
    }
    void setValue(){
        this.name = "";
    }
    final int stringLen(String arg){
        return arg.length();
    }
}
class Example2_2 extends Example2{
    public int num;
    Example2_2(String arg, int num) {
        super(arg);
        this.num = num;
    }
    void setVal(){
        super.setValue();
        this.num = 0;
    }
    void setVal(String str){
        super.setValue(str);
    }
    void setVal(int num){
        this.num = num;
    }
    void setVal(String str, int num){
        super.setValue(str);
        this.num = num;
    }
}