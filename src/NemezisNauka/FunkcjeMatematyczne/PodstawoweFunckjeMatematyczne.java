package NemezisNauka.FunkcjeMatematyczne;

import static java.lang.Math.*;

public class PodstawoweFunckjeMatematyczne {

    private static double pierwiastek(double a) {
        return sqrt(a);
    }

    private static double potega(double a, int b) {
        return pow(a, b);
    }

    private static double wartoscBezwzgledna(double a) {
        return abs(a);
    }

    public static void wyswietl() {
        double a = 4;
        System.out.println("Podstawowe funkcje matematyczne:");
        System.out.println("Pierwiastek liczby " + a + ":  " + pierwiastek(a));
        System.out.println("Liczba " + a + " do potęgi 2:  " + potega(a, 2));
        System.out.println("Wartość bezwzględna liczby " + a + ":  " + wartoscBezwzgledna(a));
        System.out.println();
    }
}
