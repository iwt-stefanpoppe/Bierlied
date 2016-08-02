/**
 * Created by spoppe on 02.08.2016.
 */
public class Bierlied {
    public static void main(String args[]) {
        int anzahl = 99;
        String wort = "Flaschen";

        while (anzahl > 0) {

            System.out.println(anzahl + " " + wortAuswahl(anzahl) + " Bier auf der Wand,");
            System.out.println(anzahl + " " + wortAuswahl(anzahl) + " Bier, ");
            System.out.println("Nimm eine runter, reich sie herum,");
            anzahl--;

            if (anzahl > 0) {
                System.out.println(anzahl + " " + wortAuswahl(anzahl) + " Bier auf der Wand!");
            } else {
                System.out.println("Es ist keine " + wortAuswahl(anzahl) + " Bier mehr auf der Wand!");
            }
        }

    }

    private static String wortAuswahl(int anzahl) {

        return (anzahl == 1) ? "Flasche" : "Flaschen";

    }
}
