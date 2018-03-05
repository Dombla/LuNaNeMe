package NemezisNauka.OperacjeWejsciaWyjscia;

public class FormatowanieWyswietlanychDanych {

    private static void tekstTekst(String a, String b) {
        System.out.printf("%15s   %-20s %n", a, b);
    }

    private static String tekstLiczbaCalkowita(String a, int b) {
        return String.format("%15s   %-15d %n", a, b);
    }

    private static String tekstLiczbaZmiennoprzecinkowa(String a, double b) {
        return String.format("%15s   %-15.2f %n", a, b);
    }

    private static boolean porownajNiezaleznieOdWielkosciLiter(String a, String b) {
        return a.equalsIgnoreCase(b);
    }

    private static void rozdzielenie(String a) {
        String b[] = a.split(":");
        for (String aB : b) {
            System.out.print(aB + "  ");
        }
        System.out.println();
    }

    public static void wyswietl(){
        String a = "Witam, witam";
        String b = "Żegnam, żegnam";
        int c = 1234567890;
        double d = 54736.6524;

        System.out.println("\nFormatowanie wyswietlanych danych:");
        tekstTekst(a,b);
        System.out.print(tekstLiczbaCalkowita(a,c));
        System.out.print(tekstLiczbaZmiennoprzecinkowa(b,d));
        System.out.println(porownajNiezaleznieOdWielkosciLiter("Czesc","czesc"));
        rozdzielenie("Ala:ma:kota");
    }
}
