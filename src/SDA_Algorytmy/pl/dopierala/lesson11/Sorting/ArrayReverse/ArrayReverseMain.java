package SDA_Algorytmy.pl.dopierala.lesson11.Sorting.ArrayReverse;

import java.util.Arrays;
import java.util.Optional;

public class ArrayReverseMain {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        String[] strings = {"Ala","ma","kota","abcd"};

        System.out.println(longestString(strings).get());
    }

    //reversing array and returning new array object.
    public static int[] reverseReturnNewObject(int[] in) {
        int[] ret = new int[in.length];
        for (int i = 0; i < in.length; i++) {
            ret[ret.length - 1 - i] = in[i];
        }
        return ret;
    }

    //reversing input array in same object.
    public static void reverse(int[] in) {
        int temp;
        for (int i = 0; i < in.length / 2; i++) {
            temp = in[i];
            in[i] = in[in.length - 1 - i];
            in[in.length - 1 - i] = temp;
        }
    }

    /**
     * Function moves first element to the end of array
     *
     * @param in Array to move first element to end. Original data WILL BE DESTROYED.
     */
    public static <T> void moveFirst2End(T[] in) {
        if (in == null || in.length == 1) {
            return;
        }

        T temp = in[0];
        for (int i = 0; i < (in.length - 1); i++) {
            in[i] = in[i + 1];
        }
        in[in.length - 1] = temp;
    }

    public static <T> void moveLast2First(T[] in) {
        T temp = in[in.length - 1];
        for (int i = 1; i < in.length; i++) {
            in[in.length - i] = in[in.length - i - 1];
        }
        in[0] = temp;
    }

    public static Optional<String> longestString(String[] in) {
        if (in == null) {
            return Optional.empty();
        }

        int maxLengthIndex = 0;
        int maxLength = in[0].length();

        for (int i = 1; i < in.length; i++) {
            if (in[i].length() >= maxLength) {
                maxLength = in[i].length();
                maxLengthIndex = i;
            }
        }

        return Optional.of(in[maxLengthIndex]);
    }

}
