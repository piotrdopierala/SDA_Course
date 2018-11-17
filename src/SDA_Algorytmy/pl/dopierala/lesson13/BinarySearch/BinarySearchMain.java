package SDA_Algorytmy.pl.dopierala.lesson13.BinarySearch;

// optymistyczny 1
// pesimistyczny log2(n)

public class BinarySearchMain {
    public static void main(String[] args) {
        int[] data = {1, 4, 7, 12, 13, 14, 15, 21, 23, 44, 55, 66, 77, 88, 99, 100};

        System.out.println(binarySearch(data, 21));
    }

    public static int binarySearch(int[] data, int value) {
        final int length = data.length;
        int left = 0;
        int right = length - 1;
        int middle = 0;
        int middle_idx = 0;

        int counter = 0;
        while (left <= right) {
            counter++;
            middle_idx = ((right + left) / 2);
            middle = data[middle_idx];
            if (value > middle)
                left = middle_idx + 1;
            else if (value < middle)
                right = middle_idx - 1;
            else {
                System.out.println(counter);
                return middle_idx;
            }
        }
        System.out.println(counter);
        return -1;
    }
}
