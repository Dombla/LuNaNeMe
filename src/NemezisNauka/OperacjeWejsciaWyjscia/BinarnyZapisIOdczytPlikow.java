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

    private static void uzycieJednegoPliku(String name) throws IOException {
        RandomAccessFile plik = new RandomAccessFile(name,"r");
        String a;
        while((a=plik.readLine())!=null){
            System.out.println(a);
        }
        plik.close();
    }

    private static void odczytStringow(String name) throws IOException {
        FileReader plik = new FileReader(name);
        BufferedReader odczyt = new BufferedReader(plik);
        String a;
        while ((a = odczyt.readLine()) != null) {
            System.out.println(a);
        }
        odczyt.close();
    }

    public static void wykonaj() throws IOException {
        String nazwa = "NemezisPliki\\Operacje binarne.txt";
        int[] a = {11110000, 11001100, 10101010};
        String[] b = {"Jeden\n", "Dwa", "Trzy"};

        System.out.println("Operacje binarne:");
        zapisIntow(nazwa, a);
        zapisStringow(nazwa, b);
        odczytStringow(nazwa);
        uzycieJednegoPliku(nazwa);
    }
}
