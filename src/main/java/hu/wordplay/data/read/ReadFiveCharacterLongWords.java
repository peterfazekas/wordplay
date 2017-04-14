package hu.wordplay.data.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Péter on 2017.04.14..
 */
public class ReadFiveCharacterLongWords implements DataRead{

    private static final int FIVE = 5;

    @Override
    public Object read(String fineName) {
        List<String> wordList = new ArrayList<>();
        try (BufferedReader file = new BufferedReader(new FileReader(fineName))){
            String word;
            while ((word = file.readLine()) != null){
                if(word.length() == FIVE) {
                    wordList.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }
}
