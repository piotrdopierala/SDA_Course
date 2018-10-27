package pl.dopierala.lesson1.Primal;

import java.util.stream.IntStream;

public class FindPrimalMain {
    public static void main(String[] args) {
        System.out.println(isPrimal(10));
    }

    public static boolean  isPrimal(int number){
        int noDividers=0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number%i==0)
                noDividers++;
        }
        if(noDividers==0 && number !=1)
            return true;
        else
            return false;
    }



}
