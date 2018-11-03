package SDA_Algorytmy.pl.dopierala.lesson12.Person;

import SDA_Algorytmy.pl.dopierala.lesson12.QuickSort.QuickSortMain;

import java.util.Arrays;
import java.util.Comparator;

public class PersonMain {
    public static void main(String[] args) {
        Person[] persons = Person.exampleArray();
        Person.sortType = 0;

        //QuickSortMain.quickSort(persons,0,persons.length-1);
        //System.out.println(Arrays.toString(persons));


        QuickSortMain.quickSortComparator(persons,0,persons.length-1, Comparator.comparing(o -> o.name));
        QuickSortMain.quickSortComparator(persons,0,persons.length-1, (o1,o2)->o1.name.compareTo(o2.name));
        System.out.println(Arrays.toString(persons));
        System.out.println(persons);
    }
}
