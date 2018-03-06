package NemezisNauka.Klasy;

import java.util.Locale;

public class PrzeciazenieMetod {

    private static int mnozenie(int a, int b){
        return a*b;
    }

    private static double mnozenie(double a, double b){
        return a*b;
    }

    private static double mnozenie(int a, double b){
        return a*b;
    }

    public static void wyswietl(){
        int a = 2;
        double b = 0.8;
        System.out.println("\nPrzeciazenie metod:");
        System.out.println(mnozenie(a,a));
        System.out.println(mnozenie(a,b));
        System.out.printf(Locale.US,"%.2f%n",mnozenie(b,b));
    }
}
