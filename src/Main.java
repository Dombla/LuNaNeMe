import PowtWiadLunatyk.Konstruktor.Konstruktor_Scenariusz;
import PowtWiadLunatyk.Konstruktor.Konstruktory.ObsługaKlasyKonstruktor;
import PowtWiadLunatyk.Konstruktor.Plik;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello Word");
        System.out.println("----------------------");

        //Powtórzenie wiadomości - Lunatykowiec
        Konstruktor_Scenariusz example = new Konstruktor_Scenariusz();

        Plik zabawa = new Plik("dupa.txt");
        zabawa.DodajDoPliku("cycki");
        zabawa.Odczyt();

    }
}
