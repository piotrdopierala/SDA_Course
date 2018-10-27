package SDA_Algorytmy.pl.dopierala.lesson11.Generics.GenericsIntro;

import java.util.Optional;

public class GenericsIntroMain {

    public static Integer[] intArray = {1,2,3,4};
    public static String[] stringArray = {"Ala","Piotr","Stefan","Dorian"};

    public static void main(String[] args) {
        //System.out.println(findGeneric(intArray, 3).get());
        int a=3;
        findGeneric(stringArray, "Ala").ifPresent(System.out::println);
        findGeneric(intArray, 3).ifPresent(System.out::println);
    }

    public static <T extends Object> Optional<T> findGeneric(T[] array, T element){
        //Element typu object
        //
        //wyszukaj element w tablicy i zwroc indeks
        // jesli nie istnieje zwroc -1
        // sposob uzycia: findGeneric(tablicaObiektow, element tablicy)



        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(element))
                return Optional.of(array[i]);
        }

        return Optional.empty();
    }
}
