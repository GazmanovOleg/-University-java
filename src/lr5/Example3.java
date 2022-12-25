package lr5;

class Rectangle{
    private final int wide;
    private final int height;
    Rectangle(int wide, int height){
        this.wide = wide;
        this.height = height;
    }
    Rectangle(int wide){
        this.wide = wide;
        this.height = 0;
    }
    Rectangle(){
        this.wide = 0;
        this.height = 0;
    }
}
public class Example3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 15);
        Rectangle r2 = new Rectangle(10);
        Rectangle r3 = new Rectangle();
    }
}
