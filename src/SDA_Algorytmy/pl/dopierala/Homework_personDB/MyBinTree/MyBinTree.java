package SDA_Algorytmy.pl.dopierala.Homework_personDB.MyBinTree;

import SDA_Algorytmy.pl.dopierala.Homework_personDB.UniqID;

import java.util.Comparator;

public class MyBinTree<T extends UniqID & Comparable<T>> {
    TreeElement<T> root;

    Comparator<T> comparator;
}
