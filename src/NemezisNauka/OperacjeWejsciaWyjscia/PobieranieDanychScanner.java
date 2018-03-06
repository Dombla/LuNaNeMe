package NemezisNauka.OperacjeWejsciaWyjscia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PobieranieDanychScanner {

    private static void pobierzOdUzytkownika() {
        Scanner s = new Scanner(System.in);
        String a;
        System.out.print("Wprowadź ciąg znaków:  ");
        a = s.nextLine();
        System.out.println(a);
    }

    private static void pobierzCiagZnakow() {
        String a = "11 22 33 44 2,3 6,9 8,7 aa bb cc";
        Scanner s = new Scanner(a);
        while(s.hasNextDouble()){
            System.out.print(s.nextDouble()+"  ");
        }
        System.out.println();
    }

    private static void pobierzZPliku(String name) throws FileNotFoundException {
        FileReader plik = new FileReader(name);
        Scanner s = new Scanner(plik);
        while(s.hasNextLine()){
            System.out.println(s.nextLine());
        }
        System.out.println();
    }

    public static void wyswietl() throws FileNotFoundException {
        System.out.println();
        System.out.println("Pobieranie danych za pomocą Scennera");
        //pobierzOdUzytkownika();
        pobierzCiagZnakow();
        pobierzZPliku("NemezisPliki\\Plik testowy.txt");
    }
}
