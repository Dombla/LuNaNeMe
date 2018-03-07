package NemezisNauka;

import NemezisNauka.FunkcjeMatematyczne.DuzeLiczby;
import NemezisNauka.FunkcjeMatematyczne.PodstawoweFunckjeMatematyczne;
import NemezisNauka.Klasy.*;
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

        PojazdDziedziczenie1 pojazd = new PojazdDziedziczenie1(25500.00,1200,280);
        System.out.println(pojazd.toString());
        DwusladowyDziedziczenie2 pojazd2 = new DwusladowyDziedziczenie2(3000.00, 730, 220, 5, "EngineV2");
        System.out.println(pojazd2.toString());
        DwusladowyDziedziczenie2 pojazd3 = new DwusladowyDziedziczenie2(pojazd, 2, "EngineV6");
        System.out.println(pojazd3.toString());
        CiezarowyDziedziczenie3 pojazd4 = new CiezarowyDziedziczenie3(pojazd3, 4000);
        System.out.println(pojazd4.toString());

    }
}
