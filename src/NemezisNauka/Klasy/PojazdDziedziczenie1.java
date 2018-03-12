package NemezisNauka.Klasy;

public class PojazdDziedziczenie1 {
    protected double cena;
    protected int waga;
    protected int maxPredkosc;

    public PojazdDziedziczenie1() {
        this.cena = 0.0;
        this.waga = 0;
        this.maxPredkosc = 0;
    }

    public PojazdDziedziczenie1(double a, int b, int c) {
        this.cena = a;
        this.waga = b;
        this.maxPredkosc = c;
    }

    public PojazdDziedziczenie1(PojazdDziedziczenie1 a) {
        this.cena = a.cena;
        this.waga = a.waga;
        this.maxPredkosc = a.maxPredkosc;
    }

    @Override
    public String toString() {
        return "Cena: " + this.cena + "    Waga: " + this.waga + "    Prędkość maksymalna: " + this.maxPredkosc;
    }
}