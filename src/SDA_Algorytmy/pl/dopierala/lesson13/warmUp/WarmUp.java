package SDA_Algorytmy.pl.dopierala.lesson13.warmUp;

import java.util.Arrays;
import java.util.Random;

public class WarmUp {
    public static void main(String[] args) {
//        boolean[] bo = new boolean[10];
//        byte[] by = new byte[10];
//        char[] ch = new char[10];
//        short[] sh = new short[10];
//        int[] in = new int[10];
//        long[] lg = new long[10];
//        float[] fl = new float[10];
//        double[] db = new double[10];
//
//        System.out.println(bo[0]);
//        System.out.println(by[0]);
//        System.out.println(ch[0]);
//        System.out.println(sh[0]);
//        System.out.println(in[0]);
//        System.out.println(lg[0]);
//        System.out.println(fl[0]);
//        System.out.println(db[0]);
//
//        int[] test1 = {1,4,78,3};
//
//        System.out.println(searchNumber(test1, 4));
//        System.out.println(searchNumber(test1, 7));

        int[] test2 = {1, 2, 3, 4, 5, 20, 30, 40, 50, 60};

        int[] inserted = insertToSorted(test2, 14);
        Arrays.stream(inserted).forEach(System.out::println);

    }

    public static int searchNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number)
                return i;
        }
        return -1;
    }

    public static int[] insertToSorted(int[] arr, int number) {
        int[] retArray = new int[arr.length + 1];

        boolean numberInserted = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number && !numberInserted) {
                retArray[i] = number;
                retArray[i + 1] = arr[i];
                numberInserted = true;
            } else {
                if (numberInserted)
                    retArray[i + 1] = arr[i];
                else
                    retArray[i] = arr[i];
            }
        }
        return retArray;
    }

    public static int[] insertToSorted2(int[] arr, int number) {
        int[] retArray = new int[arr.length + 1];
        int i=0, j=0;

        while(i<arr.length){
            if(arr[i]>number && (i==0 || arr[i-1] <= number)){
                retArray[j++]=number;
            }
        }

        return retArray;
    }

}
