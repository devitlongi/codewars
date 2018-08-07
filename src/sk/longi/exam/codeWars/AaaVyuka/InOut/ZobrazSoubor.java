package sk.longi.exam.codeWars.AaaVyuka.InOut;

/* Zobrazí textový soubor.

  Pro použití tohoto programu zadejte název souboru,
  který se má zobrazit.
  Např. pro zobrazení souboru s názvem TEST.TXT
  použijte následující příkazový řádek:

  java ZobrazSoubor TEST.TXT
*/
import java.io.*;

class ZobrazSoubor {
    public static void main(String args[])
    {
        int i;
        FileInputStream proud;

        if (args.length != 1) {
            System.out.println("Použití: ZobrazSoubor NázevSouboru");
            return;
        }

        try {
            proud = new FileInputStream(args[0]);
        }
        catch(FileNotFoundException vyjimka) {
            System.out.println("Soubor nenalezen");
            return;
        }

        try {
            do {
                i = proud.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        }
        catch(IOException vyjimka) {
            System.out.println("Chyba při čtení souboru.");
        }

        try {
            proud.close();
        } catch(IOException vyjimka) {
            System.out.println("Chyba při zavírání souboru.");
        }
    }
}
