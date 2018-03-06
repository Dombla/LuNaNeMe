package NemezisNauka.OperacjeWejsciaWyjscia;

import java.io.*;

public class BinarnyZapisIOdczytPlikow {

    private static void zapisIntow(String name, int[] tab) throws IOException {
        FileOutputStream plik = new FileOutputStream(name);
        DataOutputStream zapis = new DataOutputStream(plik);
        for (int x : tab) {
            zapis.writeInt(x);
        }
        zapis.close();
    }

    private static void zapisStringow(String name, String[] tab) {
        FileOutputStream plik = null;
        try {
            plik = new FileOutputStream(name);
        } catch (FileNotFoundException e) {
            System.out.println("Błąd otwarcia pliku!");
        }
        DataOutputStream zapis = new DataOutputStream(plik);
        for (String x : tab) {
            try {
                zapis.writeUTF(x);
            } catch (IOException e) {
                System.out.println("Błąd wejscia/wyjscia!");
            }
        }
        try {
            zapis.close();
        } catch (IOException e) {
            System.out.println("Błąd zamykania pliku!");
        }
    }

    private static void odczytIntow(String name) throws IOException {
        FileInputStream plik = new FileInputStream(name);
        DataInputStream odczyt = new DataInputStream(plik);
        int a;
        while ((a = odczyt.read()) != -1) {
            System.out.println(a);
        }
        odczyt.close();
    }

    public static void wykonaj() throws IOException {
        String nazwa = "NemezisPliki\\Operacje binarne.txt";
        int[] a = {11110000, 11001100, 10101010};
        String[] b = {"Jeden", "Dwa", "Trzy"};

        System.out.println("Operacje binarne:");
        zapisIntow(nazwa, a);
        odczytIntow(nazwa);
        zapisStringow(nazwa, b);
    }
}
