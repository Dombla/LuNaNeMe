package NemezisNauka;

import NemezisNauka.FunkcjeMatematyczne.DuzeLiczby;
import NemezisNauka.FunkcjeMatematyczne.PodstawoweFunckjeMatematyczne;
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
    }
}
