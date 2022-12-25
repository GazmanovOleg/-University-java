package lr5;

public class Example6 {
    Example6(int a){
        if (a<Min) Min = a;
        if (a>Max) Max = a;
    }
    Example6(int a, int b){
        if (Math.min(a,b)<Min) Min = Math.min(a,b);
        if (Math.max(a,b)>Max) Max = Math.max(a,b);
    }
    private int Min;
    private int Max;
    public void setMaxMin(int a ,int b){
        Min = Math.min(Math.min(Min,Max),Math.min(a,b));
        Max = Math.max(Math.max(Min,Max),Math.max(a,b));
    }
    public void setMaxMin(int a){
        Min = Math.min(Math.min(Min,Max),a);
        Max = Math.max(Math.max(Min,Max),a);
    }
    public void getMinMax(){
        System.out.println("Min = "+Min+", Max = "+Max);
    }
    /*
Предусмотрите конструктор, который работает по тому же принципу, что и
метод для присваивания значений полям. .*/
}
