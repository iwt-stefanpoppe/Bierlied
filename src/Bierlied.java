/**
 * Created by spoppe on 02.08.2016.
 */
public class Bierlied {
    public static void main(String args[]) {
        int anzahl = 99;
        String wort = "Flaschen";

        while (anzahl > 0) {

            if (anzahl == 1) {
                wort = "Flasche";
                System.out.println(anzahl + wort + " Bier an der Wand, ");
                System.out.println(anzahl + wort + " Bier, ");
                anzahl--;
                System.out.println("Keine " + wort + " Bier mehr an der Wand!");
            }

            else {
                System.out.println(anzahl + " " + wort + " Bier an der Wand,");
                System.out.println(anzahl + " " + wort + " Bier, ");
                System.out.println("Nimm eine runter, reich sie herum,");
                anzahl--;
                System.out.println(anzahl + " " + wort + " Bier an der Wand!");
            }

        }

        System.out.println("Keine " + wort + " Bier mehr an der Wand,");
        System.out.println("Keine " + wort + " Bier,");
        System.out.println("Geh in den Laden und kauf mehr,");
        anzahl = 99;
        wort = "Flaschen";
        System.out.println("dann sind es wieder " + anzahl + " " + wort + " Bier an der Wand");

    }
}
