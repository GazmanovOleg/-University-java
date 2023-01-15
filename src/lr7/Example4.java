package lr7;
public class Example4 {
    public char letter;
    Example4(Example4 ex){
        letter = ex.letter;
    }
    Example4(char letter){
        this.letter = letter;
    }
}
class Example4_4 extends Example4{
    public String str;
    Example4_4(Example4_4 ex){
        super(ex.letter);
        str = ex.str;
    }
    Example4_4(char letter, String str) {
        super(letter);
        this.str = str;
    }
}
class Example4_4_4 extends Example4_4{
    public int num;

    Example4_4_4(Example4_4_4 ex){
        super(ex.letter, ex.str);
        num = ex.num;
    }
    Example4_4_4(char letter, String str, int num) {
        super(letter, str);
        this.num = num;
    }
}