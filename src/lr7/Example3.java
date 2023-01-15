package lr7;

public class Example3 {
    public int num;
    void setVal(int num){
        this.num = num;
    }
    Example3(int num){
        this.num = num;
    }

    String toSting(){
        return this.getClass().getSimpleName()+"\n"+this.num;
    }
}

class Example3_3 extends Example3{
    public char let;
    Example3_3(int num, char let) {
        super(num);
        this.let = let;
    }

    void setVal(int num, char let){
        this.let = let;
        super.setVal(num);
    }
    String toSting(){
        return this.getClass().getSimpleName()+"\n"+this.num+"\n"+this.let;
    }
}

class Example3_3_3 extends Example3_3{
    public String str;
    Example3_3_3(int num, char let, String str) {
        super(num, let);
        this.str = str;
    }

    void setVal(int num, char let, String str){
        super.setVal(num, let);
        this.str = str;

    }
    String toSting(){
        return this.getClass().getSimpleName()+"\n"+this.num+"\n"+this.let+"\n"+this.str;
    }
}