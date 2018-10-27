package pl.dopierala.lesson1.Count_NWD;

public class Count_NWD_Main {
    public static void main(String[] args) {
        System.out.println("Obliczanie NDW liczby");

        int number1 = 132;
        int number2 = 348;

        System.out.println("Rekurencyjnie obliczyłem NWD:"+ countNWDrecursive(number1,number2));
        System.out.println("---------------");
        System.out.println("Funkcyjnie obliczyłem NWD:"+ countNWDfunction(number1,number2));
    }

    public static int countNWDrecursive(int n1, int n2){
        int result;
        if(n2==0){
            return n1;
        }
        else {
            result= countNWDrecursive(n2, n1 % n2);
        }
        return result;
    }

    public static int countNWDfunction(int n1,int n2){
        int t1=n1;
        int t2=n2;
        int temp;

        while(t2!=0){
            temp=t2;
            t2=t1%t2;
            t1=temp;
        }
        return t1;
    }

}
