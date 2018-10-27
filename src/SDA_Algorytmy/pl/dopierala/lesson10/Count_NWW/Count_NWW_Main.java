package pl.dopierala.lesson1.Count_NWW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static pl.dopierala.lesson1.Count_NWD.Count_NWD_Main.countNWDrecursive;

public class Count_NWW_Main {
    public static void main(String[] args) {
        System.out.println(countNWW(9, 3, 20));
    }

    public int countNWD(int n1,int n2){
        return (n1*n2)/ countNWDrecursive(n1,n2);
    }

    public static int countNWW(Integer... numbers){
        Integer result=0;
        if(numbers.length<=0) {
            return result;
        }
        List<Integer> a = new ArrayList(Arrays.asList(numbers));

        a.remove(0);
        result=countNWW(a.toArray(new Integer[0]));

        return result;
    }

}
