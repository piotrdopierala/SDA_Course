package SDA_Algorytmy.pl.dopierala.lesson11.Generics.GenericsIntro;

public class GenericCup <T extends Drink> {
    private T content;

    public void pourNewDrink(T drink){
        this.content=drink;
    }
}
