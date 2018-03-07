package NemezisNauka.Klasy;

public class DwusladowyDziedziczenie2 extends PojazdDziedziczenie1 {
    protected int maxPasazerow;
    protected String silnik;

    public DwusladowyDziedziczenie2() {
        super();
        this.maxPasazerow = 0;
        this.silnik = "";
    }

    public DwusladowyDziedziczenie2(double a, int b, int c, int d, String e) {
        super(a,b,c);
        this.maxPasazerow = d;
        this.silnik = e;
    }

    public DwusladowyDziedziczenie2(PojazdDziedziczenie1 a, int b, String c) {
        super(a);
        this.maxPasazerow = b;
        this.silnik = c;
    }

    public DwusladowyDziedziczenie2(DwusladowyDziedziczenie2 a) {
        super(a);
        this.maxPasazerow = a.maxPasazerow;
        this.silnik = a.silnik;
    }

    @Override
    public String toString() {
        return super.toString() + "    Maksymalnie pasażerów: " + this.maxPasazerow + "    Silnik: " + this.silnik;
    }
}
