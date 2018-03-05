package PowtWiadLunatyk.Konstruktor;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Plik {

    private File plik = null;

    public Plik(String nazwa)
    {
        plik = new File(nazwa);
    }

    public void DodajDoPliku(String slowo) throws IOException
    {
        PrintWriter zapis = new PrintWriter(plik.getName());
        zapis.println(slowo);
        zapis.close();

    }

    public void Odczyt()
    {
        Scanner odczyt = new Scanner(plik.getName());
        String wynik = null;
        while(odczyt.hasNextLine()) {
            wynik = odczyt.nextLine();
        }

        System.out.println("Twój plika zawiera: ");
        System.out.println("---------------------");
        System.out.println(wynik);
        System.out.println("---------------------");
    }

    public void ZamknijPlik()
    {

    }
}
