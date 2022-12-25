package lr5;

public class Example2 {
    char firstLetter;
    char secondLetter;
    void lettersList(){
        for(int i = (int)firstLetter; i<=(int)secondLetter;i++){
            System.out.println((char)i);
        }
    }
    public static void main(String[] args) {
        Example2 ex = new Example2();
        ex.firstLetter = 'b';
        ex.secondLetter = 'g';
        ex.lettersList();

    }
}
