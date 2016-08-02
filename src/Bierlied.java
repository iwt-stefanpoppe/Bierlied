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
            } else {
                System.out.println(anzahl + " " + wort + " Bier an der Wand,");
                System.out.println(anzahl + " " + wort + " Bier, ");
                System.out.println("Nimm eine runter, reich sie herum,");
                anzahl--;

                if (anzahl > 0)
                    System.out.println(anzahl + " " + wort + " Bier an der Wand!");
            }

        }

    }
}
