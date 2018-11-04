package SDA_Algorytmy.pl.dopierala.lesson13.MyList;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyList<T> {
    Element<T> head = null;
    Element<T> tail = null;
    int count;

    public void remove() {

    }


    public void set(Element element) {

    }

    public MyList<T> insertBefore(Element<T> nextElement, T data) {

        Element<T> eToAdd = new Element<>(data);

        eToAdd.prev = nextElement.prev;
        eToAdd.next = nextElement;
        nextElement.prev = eToAdd;
        if (eToAdd.prev != null) {
            eToAdd.prev.next = eToAdd;
        } else {
            head = eToAdd;
        }
        count++;

        return this;
    }

    public MyList<T> insertAfter(Element<T> prevElement, T data) {

        Element<T> eToAdd = new Element<>(data);

        eToAdd.prev = prevElement;
        eToAdd.next = prevElement.next;
        prevElement.next = eToAdd;
        if (eToAdd.next != null) {
            eToAdd.next.prev = eToAdd;
        } else {
            tail = eToAdd;
        }
        count++;

        return this;
    }

    public MyList<T> delete(Element<T> e) {

        if (e.prev == null && e.next == null) {
            tail = null;
            head = null;

        }
        if (e.prev != null) { //usuwany element jest pierwszy
            e.prev.next = e.next;
        } else {
            head = e.next;
        }
        if (e.next != null) { //usuwany element jest ostatni
            e.next = e.prev;
        } else {
            tail = e.prev;
        }
        count--;

        return this;
    }

    private Element<T> elmSearch(Element e) {
        Element retE = head;
        while (retE != null) {
            if (retE == e) {
                return retE;
            }
            retE = retE.next;
        }
        return null;
    }

    /**
     * Inserts element at the beginning of list
     *
     * @param data element to insert
     * @return
     */
    public MyList addFirst(T data) {
        Element<T> e = new Element<>(data);
        e.prev = null;
        e.next = head;
        head = e;
        count++;
        if (e.next != null)
            e.next.prev = e;
        else
            tail = e;
        return this;
    }

    /**
     * Inserts element at the end of list
     *
     * @param data element to insert
     * @return
     */
    public MyList<T> add(T data) {
        Element<T> e = new Element<>(data);
        e.prev = tail;
        tail = e;
        count++;

        if (e.prev != null) {
            e.prev.next = e;
        } else {
            head = e;
        }

        return this;
    }

    public void printElementsFwd() {
        Element e = head;
        while (e != null) {
            System.out.println(e);
            e = e.next;
        }
    }

    public void printElementsRev() {
        Element e = tail;
        while (e != null) {
            System.out.println(e);
            e = e.prev;
        }
    }

    @Override
    public String toString() {
        StringBuilder listAsString = new StringBuilder();

        Element e = head;
        listAsString.append("{");

        while (e != null) {
            listAsString.append("[").append(e.data).append(" ");
            if (e.prev != null) {
                listAsString.append("p:").append(e.prev.data);
            }
            if (e.next != null) {
                listAsString.append(" ").append("n:").append(e.next.data);
            }
            listAsString.append("]");
            if (e.next != null) {
                listAsString.append(",");
            }
            e = e.next;
        }
        listAsString.append("}");
        return listAsString.toString();
    }
}
