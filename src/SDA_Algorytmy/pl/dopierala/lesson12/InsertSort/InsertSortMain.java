package SDA_Algorytmy.pl.dopierala.lesson12.InsertSort;

public class InsertSortMain {
    public static void main(String[] args) {
        Integer[] intArray = {7, 3, 8, 5, 2};
        insertSort2(intArray);
        printArray(intArray);
    }

    public static <T extends Comparable> void insertSort(T[] in) {
        int n = in.length;
        int i;

        for (int j = n - 2; j >= 0; j--) { //j is index of value we want to insert in order
            T x = in[j]; //take number to insert.
            for (i = j + 1; i < n; i++) { //i iterates over already sorted part of array
                if (x.compareTo(in[i])<0)//(x < in[i])
                    break;
                in[i - 1] = in[i];//move sorted element to the left.
            }
            in[i - 1] = x;
        }
    }

    public static <T extends Comparable> void insertSort2(T[] in) {
        insertSortRecurse(in, in.length - 1);
    }


    private static <T extends Comparable> void insertSortRecurse(T[] in, int i) {
        int j;
        int n = in.length;
        T x = in[i - 1];

        for (j = i; j < n; j++) {
            if (in[j].compareTo(x)<0){//(in[j] < x) {
                in[j - 1] = in[j];
            } else
                break;
        }
        in[j - 1] = x;
        if (i - 1 > 0)
            insertSortRecurse(in, i - 1);
    }

    private static <T> void printArray(T[] in) {
        System.out.printf("[");
        for (int i = 0; i < in.length - 1; i++) {
            System.out.printf("%s,", in[i]);
        }
        System.out.printf("%s]\n", in[in.length - 1]);
    }

}
