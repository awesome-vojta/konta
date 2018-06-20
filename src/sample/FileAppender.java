package sample;

import java.io.*;

public class FileAppender {

    //TODO: DULEZITY!!!!
    // tady musis zmenit cestu k tvojemu souboru, muj projekt se nachazi na tehle ceste
    // /home/vojta/Documents/development/java/konta/
    // tvuj bude tam kam ho ulozis
    // nevim jak to funguje na windowsu, vyzkousej a rekni kdyz to nepujde
    private static File file = new File("/home/vojta/Documents/development/java/konta/src/sample/data.txt");


    /**
     * Metoda ktera zapise do souboru kterej jsme na radku 12 nekam ulozili (musi existovat pred rozbehnutim appky)
     * Parametr "line"
     */

    public static void append(String line){
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
