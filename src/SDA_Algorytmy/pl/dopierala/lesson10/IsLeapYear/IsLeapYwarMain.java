package pl.dopierala.lesson1.IsLeapYear;

public class IsLeapYwarMain {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year){
        if(((year%4==0) && (year%100!=0)) || (year%400==0)){
            return true;
        }
        return false;
    }
}
