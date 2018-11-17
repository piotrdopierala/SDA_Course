package SDA_Algorytmy.pl.dopierala.lesson13.Stack;

import java.util.Stack;

public class Stack_Main {
    public static void main(String[] args) {

        baseConverter(0b101,10);
        //baseConverter(14,16);
        //baseConverter(066,8);
        //baseConverter(0b1011,2);
        //baseConverter(0xFF,10);

    }

    public static void baseConverter(int number, int base){
        Stack stack = new Stack();
        String result="";
        int temp;

        while(number!=0){
            stack.push(number%base);
            number = number/base;
        }

        StringBuilder sbld = new StringBuilder();
        while(!stack.isEmpty()){
            sbld.append(stack.pop());
        }
        System.out.println(sbld.toString());
    }
}
