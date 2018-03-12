package NemezisNauka.Interfejsy;

public class Inter implements Rosliny {
    public int ileLisci;

    @Override
    public boolean lisciasteIglaste(String nazwa) {
        return !nazwa.equals("sosna") && !nazwa.equals("świerk");
    }

    @Override
    public String[] witaminy() {
        String[] wit = new String[4];
        char jaka = 'A';
        for (int i = 0; i < wit.length; i++) {
            wit[i] = "" + jaka;
            jaka++;
        }
        return wit;
    }

    public void wiek() {
        System.out.println("Drzewa żyją setki lat");
    }
}
