package SDA_Algorytmy.pl.dopierala.lesson13.MyList;

public class Element <T> {
    Element<T> next=null;
    Element<T> prev=null;
    T data;

    public Element(T data) {
        this.data = data;
    }

    public boolean hasNext(){
        if(next==null)
            return false;
        else
            return true;
    }

    @Override
    public String toString() {
        return "Element{" +
               // "next=" + next.data +
               // ", prev=" + prev.data +
                ", data='" + data + '\'' +
                '}';
    }
}
