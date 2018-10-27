package SDA_Algorytmy.pl.dopierala.lesson11.Sorting.BubleSort;

import java.util.Arrays;

public class BubleSortMain {
    public static void main(String[] args) {
        Integer[] arrIntToSort = {66, 50, 47, 44, 30, 22, 10, 5, 3};
        String[] arrStringToSort = {"Zuzanna","Ala", "Piotr", "Bartek"};

        System.out.println("Sortujemy babelkowo tablice wejsciowa:");
       // Arrays.stream(arrToSort).forEach(System.out::println);
        printArray(arrStringToSort);
        System.out.println("Wynik sortowania:");
        BubbleSort(arrStringToSort);
        //Arrays.stream(arrToSort).forEach(System.out::println);
        printArray(arrStringToSort);
    }


    public static <T extends Comparable> void BubbleSort(T[] in) {

        int n = in.length;

        for (int j = 0; j < n - 1; j++) {
            boolean swapOccurred = false;
            for (int i = 0; i < (n - 1 - j); i++) {
                if (in[i].compareTo(in[i + 1])>0) {
                    T temp = in[i];
                    in[i] = in[i + 1];
                    in[i + 1] = temp;
                    swapOccurred = true;
                }
            }
            if (!swapOccurred) {
                System.out.println("Outer iteration count:" + (j + 1));
                return;
            }
        }
    }

    private static <T> void printArray(T[] in){
        System.out.printf("[");
        for (int i = 0; i < in.length-1; i++) {
            System.out.printf("%s,",in[i]);
        }
        System.out.printf("%s]\n",in[in.length-1]);
    }
}