package SDA_Algorytmy.pl.dopierala.lesson12.InsertSort;

//morning warm up.
public class FibonacciAgain {
    public static void main(String[] args) {
        System.out.println(fibonacci(19));
    }

    public static int fibonacci(int d){
        if(d==0)
            return 0;
        if(d==1)
            return 1;
        return(fibonacci(d-1)+fibonacci(d-2));
    }
}
