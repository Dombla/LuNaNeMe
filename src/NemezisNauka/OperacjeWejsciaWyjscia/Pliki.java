package NemezisNauka.OperacjeWejsciaWyjscia;

import java.io.*;

public class Pliki {

    private static void tworzenie(String name) {
        File nowy = new File(name);
    }

    private static void zapis(String name) throws FileNotFoundException {
        PrintWriter plik = new PrintWriter(name);
        plik.println("123 456 789");
        plik.println("1.1 2.2 3.3");
        plik.println("aaa bbb ccc");
        plik.println("AAA BBB CCC");
        plik.close();
    }

    private static void wczytywanie(String name) throws IOException {
        FileReader plik = new FileReader(name);
        BufferedReader odczyt = new BufferedReader(plik);
        String a;
        while ((a = odczyt.readLine()) != null) {
            System.out.println(a);
        }
        odczyt.close();
    }

    public static void wykonaj() throws IOException {
        String name = "Plik testowy.txt";
        tworzenie(name);
        zapis(name);
        System.out.println("\nWyświetlenie zawartości pliku:");
        wczytywanie(name);
    }
}
