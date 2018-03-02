package PowtWiadLunatyk.Konstruktor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObsługaKlasyKonstruktor {

    //tworzę listę, która będzie przetrzymywać stworzone już obiekty
    private List<Konstruktor> lista_obiektów = new ArrayList<>();

    public void DodajObiektBezParametrow (){
        //Pierwszy sposób tworzenia obiektu
        Konstruktor bezparametrowy = new Konstruktor();
        //ustawiam ID - bedzie mial on numer następny po ilosci utworzonych obiektów
        bezparametrowy.id = PodajIloscObiektow();
        //ustawiam nazwę obiektu
        bezparametrowy.name = "Bezparametrowy";
        //Wywołuję funkcję, zeby dodać nowy obiekt do listy
        DodajObiektDoListy(bezparametrowy);
    }

    public void DodajObiektZParametrami (String new_name){
        //Drugi sposób tworzenia obiektu
        Konstruktor parametrowy = new Konstruktor(PodajIloscObiektow(), "Parametrowy");
        //Wywołuję funkcję, zeby dodać nowy obiekt do listy
        DodajObiektDoListy(parametrowy);
    }


    public void DodajObiektTenSamCoInny (){
        //Tworzę nowy obiekt o podanej nazwie
        Konstruktor pierwszy = new Konstruktor(PodajIloscObiektow(), "Duplikat");
        //Dodaję ten obiekt do listy, zeby był razem ze wszystkimi
        DodajObiektDoListy(pierwszy);
        //Trzeci sposób tworzenia obiektu
        Konstruktor kopia_pierwszego = new Konstruktor(pierwszy);
        //Wywołuję funkcję, zeby dodać nowy obiekt do listy
        DodajObiektDoListy(kopia_pierwszego);
    }

    public void DodajObiektJakoUzytkownik(){
        //////////////////////////NIEDOKONCZONE////////////////////////////////
        System.out.println("Tworzymy nowy obiekt klasy 'Konstruktor'");
        System.out.println("Proszę podać nazwę obiektu: ");
        String new_name = new Scanner(System.in).nextLine();
    }

    private void DodajObiektDoListy(Konstruktor nowy_obiekt){
        //Dodawanie do listy już istniejący obiekt
        lista_obiektów.add(nowy_obiekt);
    }

    public void PokazWszystkieObiekty(){
        //pętla for która porusza się po każdym obiekcie z listy
        for(Konstruktor x : lista_obiektów){
            System.out.println("************************");
            System.out.println("Obiekt nr: " + x.id);
            System.out.println("Posiada on parametry: ");
            System.out.println("Id: " + x.id);
            System.out.println("Name: " + x.name);
            System.out.println("************************");
        }
    }

    public int PodajIloscObiektow(){
        //Wyswietla rozmiar listy - ilosc posiadanych elementów
        return lista_obiektów.size();
    }

}
