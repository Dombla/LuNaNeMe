package NemezisNauka.Interfejsy;

public class Inter implements Rosliny {
    public int ileLisci;

    public void wiek() {
        System.out.println("Drzewa żyją setki lat");
    }

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

    @Override
    public void wiadomosc() {
        System.out.println("Nie każda roślina potrzebuje słońca");
    }
}
