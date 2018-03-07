package NemezisNauka.Klasy;

public class CiezarowyDziedziczenie3 extends DwusladowyDziedziczenie2 {
    private int maxLadunek;

    public CiezarowyDziedziczenie3() {
        super();
        maxLadunek = 0;
    }

    public CiezarowyDziedziczenie3(double a, int b, int c, int d, String e, int f) {
        super(a,b,c,d,e);
        maxLadunek = f;
    }

    public CiezarowyDziedziczenie3(DwusladowyDziedziczenie2 a, int b) {
        super(a);
        maxLadunek = b;
    }

    @Override
    public String toString() {
        return super.toString() + "    Maksymalny ładunek: " + this.maxLadunek;
    }
}
