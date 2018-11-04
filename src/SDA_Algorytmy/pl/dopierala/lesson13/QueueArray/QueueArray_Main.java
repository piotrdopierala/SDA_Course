package SDA_Algorytmy.pl.dopierala.lesson13.QueueArray;

public class QueueArray_Main {
    public static void main(String[] args) {
        QueueArray a = new QueueArray();
        a.push(10);
        a.push(20);
        a.push(30);

        System.out.println(a);

        a.pull();
        a.pop();

    }
}
