package PowtWiadLunatyk.Konstruktor;

import PowtWiadLunatyk.Konstruktor.Pliki.Plik;

import java.io.IOException;

public class Plik_Scenariusz {

    public Plik_Scenariusz() throws IOException{
        Plik zabawa = new Plik("test.txt");
        zabawa.DodajDoPliku("Początek tekstu");
        zabawa.Odczyt();
    }
}
