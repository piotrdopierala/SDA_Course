package SDA_Algorytmy.pl.dopierala.lesson12.InsertSort;

public class InsertSortMain {
    public static void main(String[] args) {
        int[] intArray = {7,3,8,5,2};
        insertSort(intArray);
    }

    public static int[] insertSort(int[] in){
        int n = in.length;
        int i;

        for (int j = n-2; j >= 0; j--) { //j is index of value we want to insert in order
            int x = in[j]; //take number to insert.
            for (i = j+1; i < n; i++) { //i iterates over already sorted part of array
                if(x<in[i]) //
                    break;
                in[i-1]=in[i];//move sorted element to the left.
            }
            in[i-1]=x;
        }
        return in;
    }
}
