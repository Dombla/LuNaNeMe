package NemezisNauka.Interfejsy;

public interface Rosliny extends Drzewa, Warzywa {
    String komunikat = "Każda roślina pije wode";

    default void wiadomosc() {
        System.out.println("Każda roślina potrzebuje słońca");
    }
}
