package sample;

import java.io.*;
import java.net.URL;

public class FileScanner {

    //TODO: DULEZITY!!!!
    // tady musis zmenit cestu k tvojemu souboru, muj projekt se nachazi na tehle ceste
    // /home/vojta/Documents/development/java/konta/
    // tvuj bude tam kam ho ulozis
    // nevim jak to funguje na windowsu, vyzkousej a rekni kdyz to nepujde
    private static File file = new File("/home/vojta/Documents/development/java/konta/src/sample/data.txt");

    /**
     * Precte obsah souboru a vrati ho, tudle metodu vola ShowAccounts.java
     */
    public static String getText() throws FileNotFoundException {
        String content = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                content = content + line + "\n"; // + "\n" znamena odEnteruj (udelej novej radek)
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

}
