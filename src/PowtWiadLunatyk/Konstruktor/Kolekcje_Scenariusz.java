package PowtWiadLunatyk.Konstruktor;

import PowtWiadLunatyk.Konstruktor.Kolekcje.Kolekcje;

public class Kolekcje_Scenariusz {
    public Kolekcje_Scenariusz(){
        Kolekcje<Integer> example = new Kolekcje<Integer>();

        example.Dodaj(5);
        example.Dodaj(6);
        example.Dodaj(7);

        example.Usun(6);
        example.PokazWszystko();
        example.Znajdz(5);

    }
}
