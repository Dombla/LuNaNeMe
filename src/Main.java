import PowtWiadLunatyk.Konstruktor.ObsługaKlasyKonstruktor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        System.out.println("----------------------");

        /////////////////////LUNATYKOWIEC - POWTÓRZENIE WIADOMOSCI - KONSTRUKTORY////////////////////////////////////

        //Tworzę klasę zawierającą listę obiektów, na której można zarządzać nimi
        ObsługaKlasyKonstruktor lista = new ObsługaKlasyKonstruktor();

        //Tworzę obiekt poprzez konstruktor domyślny - bezparametrowy
        lista.DodajObiektBezParametrow();

        //Tworzę obiekt poprzez nadanie mu nazwy
        lista.DodajObiektZParametrami("Second Object");

        //Tworzę duplikat poprzednego stworzonego obiektu
        //Spójrz na implementację funkcji 'DodajObiektTenSamCoInny' klasy ObsługaKlasyKonstruktor
        lista.DodajObiektTenSamCoInny();

        //Tworze nowy obiekt jako uzytkownik
        lista.DodajObiektJakoUzytkownik();

        //Wyswietlam wszystkie obecne stworzone obiekty
        lista.PokazWszystkieObiekty();

        //Szukanie obiektu o danej nazwie:
        lista.ZnajdzObiekt("Bezparametrowy");

        //Wyswietlam liczbę obiektów stworzonych
        System.out.println("Liczba obiektów: " + lista.PodajIloscObiektow());
        //////////////////////////////////////////////////END////////////////////////////////////////////////
    }
}
