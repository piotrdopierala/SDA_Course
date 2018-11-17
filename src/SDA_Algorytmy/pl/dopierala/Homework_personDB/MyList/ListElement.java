package SDA_Algorytmy.pl.dopierala.Homework_personDB.MyList;

import SDA_Algorytmy.pl.dopierala.Homework_personDB.UniqID;

class ListElement<T extends UniqID & Comparable<T>> {
    T data;
    ListElement<T> next;
    ListElement<T> prevous;


    public ListElement(T data) {
        this.data = data;
    }
}
