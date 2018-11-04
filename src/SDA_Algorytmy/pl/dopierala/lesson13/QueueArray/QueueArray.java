package SDA_Algorytmy.pl.dopierala.lesson13.QueueArray;

import java.util.Arrays;

public class QueueArray {
    private int[] array;

    public void push(int value) {

        incSize();
        array[array.length - 1] = value;
        //System.out.println("Wstawiam element " + value + " kolejka ma rozmiar " + array.length);
    }

    public int pop() {
        if (array.length < 1) {
            throw new ArrayIndexOutOfBoundsException("BLAD! Probowano poprać element gdy rozmiar jest rowny 0");
        }
        int poppedValue = array[array.length - 1];
        decSize();
        //System.out.println("Pobieram element z miejsca " + (array.length + 1) + ", ma wartosc " + poppedValue);
        return poppedValue;
    }

    public int pull(){
        if (array.length < 1) {
            throw new ArrayIndexOutOfBoundsException("BLAD! Probowano poprać element gdy rozmiar jest rowny 0.");
        }
        int retValue = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i]=array[i+1];
        }
        decSize();
        //System.out.println("Pobieram element 1 miejsca , ma wartosc " + retValue +". Zmniejszam rozmiar do "+array.length);
        return retValue;
    }

    private void incSize() {
        int[] newArray;
        if(array==null)
            newArray=new int[1];
        else
            newArray = Arrays.copyOf(array, array.length + 1);
        array = newArray;

    }

    private void decSize() {
        int[] newArray = Arrays.copyOf(array, array.length - 1);
        array = newArray;
    }





}
