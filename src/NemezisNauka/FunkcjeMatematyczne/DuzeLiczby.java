package NemezisNauka.FunkcjeMatematyczne;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class DuzeLiczby {

    private static BigInteger dodawanie(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    private static BigInteger odejmowanie(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    private static BigDecimal mnozenie(BigDecimal a, BigDecimal b) {
        return a.multiply(b).setScale(20, BigDecimal.ROUND_HALF_UP);
    }

    private static BigDecimal dzielenie(BigDecimal a, BigDecimal b) {
        return a.divide(b,20, RoundingMode.CEILING);
    }

    public static void wyswietl() {
        BigInteger a = new BigInteger("78349056896723789569876509347889560594368900879081238008");
        BigInteger b = new BigInteger("14369278576474253489769560097807205781525414321341233556");
        BigDecimal c = new BigDecimal("567894267985789034789456843765.5478253675447823432465456");
        BigDecimal d = new BigDecimal("2");

        System.out.println("Duże liczby:");
        System.out.println("Dodawanie:  " + dodawanie(a, b));
        System.out.println("Odejmowanie:  " + odejmowanie(a, b));
        System.out.println("Mnozenie:  " + mnozenie(c, d));
        System.out.println("Dzielenie:  " + dzielenie(c, d));
    }
}
