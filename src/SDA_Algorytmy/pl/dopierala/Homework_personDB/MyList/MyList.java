package SDA_Algorytmy.pl.dopierala.Homework_personDB.MyList;

import SDA_Algorytmy.pl.dopierala.Homework_personDB.UniqID;

import java.util.Comparator;
import java.util.Optional;

public class MyList<T extends UniqID & Comparable<T>> {
    ListElement<T> root;
    ListElement<T> tail;
    Comparator<T> comparator;
    int count;

    public MyList(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public MyList() {
    }

    public Optional<ListElement<T>> findElement(int id) {
        Optional<ListElement<T>> ret = Optional.empty();

        ListElement<T> element = root;

        while (element != null) {
            if (element.data.getId() == id) {
                return Optional.of(element);
            }
            element = element.next;
        }
        return ret;
    }

    public void addAfter(int idToAddAfter, T data) {
        Optional<ListElement<T>> afterOptional=findElement(idToAddAfter);
        if (afterOptional.isPresent()) {
            ListElement<T> after = afterOptional.get();
            ListElement<T> newElement = new ListElement<>(data);
            newElement.prevous=after;
            newElement.next=after.next;
            if(newElement.next==null)
                tail=newElement;
            after.next=newElement;
            count++;
        }
    }

    public void addBefore(int idToAddBefore, T data) {
        Optional<ListElement<T>> afterOptional=findElement(idToAddBefore);
        if (afterOptional.isPresent()) {
            ListElement<T> before = afterOptional.get();
            ListElement<T> newElement = new ListElement<>(data);
            newElement.next=before;
            newElement.prevous=before.prevous;
            if(newElement.prevous==null)
                root=newElement;
            before.prevous=newElement;
            count++;
        }
    }

    public void addLast(T data) {
        ListElement<T> element = new ListElement<>(data);

        element.prevous = tail;
        if (tail != null) {
            tail.next = element;
        } else {
            root = element;
        }
        tail = element;
        count++;
    }

    public void addFirst(T data) {
        ListElement<T> element = new ListElement<>(data);

        element.next = root;
        if (element.next != null) {
            root.prevous = element;
        } else {
            tail = element;
        }
        root = element;
        count++;
    }


}
