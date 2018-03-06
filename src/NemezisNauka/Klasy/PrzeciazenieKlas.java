package NemezisNauka.Klasy;

public class PrzeciazenieKlas {
    public int x;

    public PrzeciazenieKlas dodajKlasyInwazyjne(PrzeciazenieKlas a) {
        a.x += this.x;
        return a;
    }

    public PrzeciazenieKlas dodajKlasy(PrzeciazenieKlas a) {
        PrzeciazenieKlas pom = new PrzeciazenieKlas();
        pom.x = a.x + this.x;
        return pom;
    }

    public void dodajKlasy2(PrzeciazenieKlas a, PrzeciazenieKlas b) {
        this.x = a.x + b.x;
    }

    public void dodajDoWywolywanej(PrzeciazenieKlas a) {
        this.x += a.x;
    }
}
