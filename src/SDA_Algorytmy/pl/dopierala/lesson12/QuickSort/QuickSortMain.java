package SDA_Algorytmy.pl.dopierala.lesson12.QuickSort;

import java.util.Comparator;

public class QuickSortMain {
    public static void main(String[] args) {
        Integer[] intArray = {9,8,7,6,1,2,3,5,3,2,4,7,5};
        String[] stringArray = {"Zuzanna","Zzuanna","Dorian","Ala","Piotrek",};

        //quickSort(intArray,0,intArray.length-1);
        while(true) {
            quickSort(stringArray, 0, stringArray.length - 1);
            printArray(stringArray);
        }
    }

    public static <T extends Comparable> void quickSort(T[] in,int left, int right){

        int pwtIdx=(left+right)/2;
        T pwt=in[pwtIdx];
        in[pwtIdx]=in[right];

        int j=left;
        int i=left;

        for(i=left;i<right;i++){ //lewa strona
            if(in[i].compareTo(pwt)<0){
                T temp = in[i]; //replace
                in[i]=in[j];
                in[j]=temp;
                j++;
            }
        }

        in[right]=in[j];
        in[j]=pwt;

        if(left<(j-1))
            quickSort(in,left,j-1);
        if((j+1)<right){
            quickSort(in,j+1,right);
        }

    }

    public static <T extends Comparable> void quickSortComparator(T[] in, int left, int right, Comparator<T> comparator){

        int pwtIdx=(left+right)/2;
        T pwt=in[pwtIdx];
        in[pwtIdx]=in[right];

        int j=left;
        int i=left;

        for(i=left;i<right;i++){ //lewa strona
            if(comparator.compare(in[i],pwt)<0){
            //if(in[i].compareTo(pwt)<0){
                T temp = in[i]; //replace
                in[i]=in[j];
                in[j]=temp;
                j++;
            }
        }

        in[right]=in[j];
        in[j]=pwt;

        if(left<(j-1))
            quickSort(in,left,j-1);
        if((j+1)<right){
            quickSort(in,j+1,right);
        }

    }

    private static <T> void printArray(T[] in) {
        System.out.printf("[");
        for (int i = 0; i < in.length - 1; i++) {
            System.out.printf("%s,", in[i]);
        }
        System.out.printf("%s]\n", in[in.length - 1]);
    }
}
