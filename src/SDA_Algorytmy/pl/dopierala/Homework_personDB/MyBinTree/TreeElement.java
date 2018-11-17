package SDA_Algorytmy.pl.dopierala.Homework_personDB.MyBinTree;

import SDA_Algorytmy.pl.dopierala.Homework_personDB.UniqID;

class TreeElement<T extends UniqID & Comparable<T>> {
    T data;
    TreeElement<T> leftEl;
    TreeElement<T> rightEl;
}
