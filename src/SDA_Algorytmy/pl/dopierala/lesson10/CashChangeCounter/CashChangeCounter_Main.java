package pl.dopierala.lesson1.CashChangeCounter;

import java.util.*;

public class CashChangeCounter_Main {
    public static void main(String[] args) {
        CountChange(1765.54).entrySet().stream().forEach(System.out::println);
    }

    public static Map<Double, Integer> CountChange(Double amount) {

        Double[] nominals = {200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

        Double change = amount;

        Map<Double, Integer> changeNominalsNo = new LinkedHashMap<>();

        for (int i = 0; i < nominals.length; i++) {
            changeNominalsNo.put(nominals[i], (int) Math.floor(change / nominals[i]));
            change = change - (nominals[i] * changeNominalsNo.get(nominals[i]));
            change = Math.round(change * 100.0) / 100.0;
        }
        return changeNominalsNo;
    }

}
