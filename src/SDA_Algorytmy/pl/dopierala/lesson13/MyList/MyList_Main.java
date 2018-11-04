package SDA_Algorytmy.pl.dopierala.lesson13.MyList;

public class MyList_Main {

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();


        list
                .add("E0")
                .add("E1")
                .add("E2")
                .add("E3")
                .add("E4");

        list.insertAfter(list.tail,"Ex");

        //list.addFirst(new Element("Ex"));


        System.out.println(list);

    }
}
