package PowtWiadLunatyk.Konstruktor.Kolekcje;

import java.util.*;

//TODO


public class Kolekcje<T> {
    //tradycyjna lista - najczesciej uzywana
    private List<T> array = new ArrayList<T>();
    //kiedy często się usuwa elementy z listy
    private List<T> linked = new LinkedList<>();

    //nie wolno int, trzeba Integer - mapa (klucz, wartosc)
    //private Map<T, T> mapa = new HashMap<>();

    private Set<T> zbior = new HashSet<>();



    public void Dodaj(T cos){
        array.add(cos);
        linked.add(cos);
        zbior.add(cos);
    }

    /*public void DodajMape(T key,  T value)
    {
        //mapa.put(key,value);
    }*/

    public void Usun(int liczba){
        array.remove(liczba);
        linked.remove(liczba);
        zbior.remove(liczba);
        //mapa.remove(liczba);
    }


    public void PokazWszystko(){
        System.out.println("------ARRAY----------");
        for(T x : array){
            System.out.println(x);
        }
        System.out.println("------LINKED----------");
        for(T x : linked){
            System.out.println(x);
        }
        System.out.println("------SET---------");
        for(T x : zbior){
            System.out.println(x);
        }

        /*System.out.println("------MAPA---------");
        for (Map.Entry<T, T> x : mapa.entrySet())
        {
            System.out.println("Key: "+x.getKey() + ", Value: " + x.getValue());
        }*/

    }

    public void Znajdz(T search){
        System.out.println("------ARRAY----------");
        for(T x : array){
            if(x.equals(search)) {
                System.out.println("Znaleiono !");
                System.out.println(x);
            }
            else
            {
                System.out.println("Nie znaleziono !");
            }
        }
        System.out.println("------LINKED----------");
        for(T x : linked){
            if(x.equals(search)) {
                System.out.println("Znaleziono !");
                System.out.println(x);
            }
            else
            {
                System.out.println("Nie znaleziono !");
            }
        }
        System.out.println("------SET---------");
        for(T x : zbior){
            if(x.equals(search)){
                System.out.println("Znaleziono !");
                System.out.println(x);
            }
            else System.out.println("Nie znaleziono !");

        }
    }
}
