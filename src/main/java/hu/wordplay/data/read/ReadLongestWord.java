package hu.wordplay.data.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Péter on 2017.04.14..
 */
public class ReadLongestWord implements DataRead{

    @Override
    public Object read(String fineName) {
        String longestWord = "";
        try (BufferedReader file = new BufferedReader(new FileReader(fineName))){
            String word;
            while ((word = file.readLine()) != null){
                if(word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return longestWord;
    }
}
