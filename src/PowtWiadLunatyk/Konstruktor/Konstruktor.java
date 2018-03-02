package PowtWiadLunatyk.Konstruktor;

public class Konstruktor {

    int id = 0;
    public String name = "";

    //konstruktor bezparametrowy
    public Konstruktor(){

        System.out.println("Stworzono obiekt przez bezparametrowy konstruktor.");
        System.out.println("----------------------");
    }

    //konstruktor parametrowy
    public Konstruktor(int set_id, String set_name){
        this.name = set_name;
        this.id = set_id;
        System.out.println("Stworzono obiekt przez parametrowy konstruktor (int, string)");
        System.out.println("Stworzono obiekt o id: "+id+" i nazwie: "+name);
        System.out.println("----------------------");
    }

    //konstruktor, który tworzy duplikat
    public Konstruktor(Konstruktor new_class){
        this.id = new_class.id;
        this.name = new_class.name;
        System.out.println("Stworzono duplikat innego obiektu, ale pod inną nazwą,");
        System.out.println("przez parametr jako inny obiekt (Konstruktor).");
        System.out.println("Jestem nowym obiektem, o takim samym id i nazwie jak podana klasa");
        System.out.println("Stworzono obiekt o id: "+id+" i nazwie: "+name);
        System.out.println("----------------------");
    }

    //funkcja wypisująca zmienne stworzonego obiektu
    public void PrzedstawSie(){
        System.out.println("Jestem obiektem klasy 'Konstruktor'");
        System.out.println("id obiektu: " + id);
        System.out.println("nazwa obiektu: " + name);
        System.out.println("----------------------");
    }

}