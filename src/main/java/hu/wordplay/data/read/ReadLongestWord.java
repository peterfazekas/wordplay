package hu.wordplay.data.read;

import hu.wordplay.data.service.Source;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public class ReadLongestWord implements DataRead {

    /**
     * 2. feladat: Írja ki a képernyőre, hogy melyik a leghosszabb szó a szoveg.txt állományban, és
     * az hány karakterből áll! Ha több azonos leghosszabb hosszúságú szó is van a szógyűjteményben,
     * akkor azok közül elegendő egyetlen szót kiírnia. A feladatot úgy oldja meg, hogy tetszőleges
     * hosszúságú szövegállomány esetén működjön, azaz a teljes szöveget ne tárolja a memóriában!
     *
     * @return String - a leghosszabb szó
     */
    @Override
    public Object read() {
        String longestWord = "";
        try (BufferedReader file = new BufferedReader(new FileReader(Source.INPUT))) {
            String word;
            while ((word = file.readLine()) != null) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return longestWord + " (" + longestWord.length() + " karakter hosszú)";
    }
}
