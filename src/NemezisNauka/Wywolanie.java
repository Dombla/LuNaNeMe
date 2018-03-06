package NemezisNauka;

import NemezisNauka.FunkcjeMatematyczne.DuzeLiczby;
import NemezisNauka.FunkcjeMatematyczne.PodstawoweFunckjeMatematyczne;
import NemezisNauka.Klasy.Konstruktory;
import NemezisNauka.Klasy.PrzeciazenieKlas;
import NemezisNauka.Klasy.PrzeciazenieMetod;
import NemezisNauka.OperacjeWejsciaWyjscia.BinarnyZapisIOdczytPlikow;
import NemezisNauka.OperacjeWejsciaWyjscia.FormatowanieWyswietlanychDanych;
import NemezisNauka.OperacjeWejsciaWyjscia.Pliki;
import NemezisNauka.OperacjeWejsciaWyjscia.PobieranieDanychScanner;

import java.io.IOException;

public class Wywolanie {
    public static void wywolaj() throws IOException {

        PodstawoweFunckjeMatematyczne.wyswietl();
        DuzeLiczby.wyswietl();

        FormatowanieWyswietlanychDanych.wyswietl();
        Pliki.wykonaj();
        PobieranieDanychScanner.wyswietl();
        BinarnyZapisIOdczytPlikow.wykonaj();

        PrzeciazenieMetod.wyswietl();

        PrzeciazenieKlas klasa1 = new PrzeciazenieKlas();
        PrzeciazenieKlas klasa2 = new PrzeciazenieKlas();
        klasa1.x = 2;
        klasa2.x = 3;
        PrzeciazenieKlas klasa3 = klasa1.dodajKlasy(klasa2);
        System.out.println("\nPrzeciążenie klas:\n" + klasa3.x);
        klasa1.dodajDoWywolywanej(klasa3);
        System.out.println(klasa1.x);
        klasa3.dodajKlasy2(klasa1, klasa2);
        System.out.println(klasa3.x);

        Konstruktory klasa5 = new Konstruktory(2, "xxx");
        System.out.printf("%n%s%n%d  %s%n", "Konstruktory:", klasa5.a, klasa5.b);

    }
}
