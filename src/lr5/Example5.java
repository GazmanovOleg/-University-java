package lr5;

public class Example5 {
    Example5(int num){
        this.num = Math.min(num, 100);
    }
    Example5(){
        this.num = 0;
    }
    private int num;

    public void setNum(int num) {
        this.num = Math.min(num, 100);
    }
    public void setNum() {
        this.num = 0;
    }
    public int getNum(){
        return num;
    }
}
