package lr5;

class Ex1{
    private char symbol;
    public void setSymbol(char symbol){
        this.symbol = symbol;
    }
    public int codeSymbol(){
        return (int)symbol;
    }
    public void printSymbol(){
        System.out.println("символ = "+symbol+", код ="+ this.codeSymbol());
    }
}
public class Example1 {
    public static void main(String[] args) {
        Ex1 example1 = new Ex1();
        example1.setSymbol('h');
        example1.printSymbol();

    }
}
