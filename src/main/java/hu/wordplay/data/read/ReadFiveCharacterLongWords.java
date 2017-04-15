package hu.wordplay.data.read;

import hu.wordplay.data.service.Source;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public class ReadFiveCharacterLongWords implements DataRead {

    private static final int FIVE = 5;

    /**
     * 4-5. feladat: Gyűjtse ki a fájlban található ötkarakteres szavakat!
     *
     * @return String lista az 5 kerekter hosszú szavakkal
     */
    @Override
    public Object read() {
        List<String> wordList = new ArrayList<>();
        try (BufferedReader file = new BufferedReader(new FileReader(Source.INPUT))) {
            wordList = file.lines().filter(this::isFiveCharacterLong).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }

    private boolean isFiveCharacterLong(final String word) {
        return word.length() == FIVE;
    }
}
