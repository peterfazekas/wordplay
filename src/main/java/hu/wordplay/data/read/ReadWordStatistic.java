package hu.wordplay.data.read;

import hu.wordplay.data.service.WordStatistic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Péter on 2017.04.14..
 */
public class ReadWordStatistic implements DataRead {

    private final WordStatistic statistic;

    public ReadWordStatistic() {
        statistic = new WordStatistic();
    }

    @Override
    public Object read(String fineName) {
        int wordCount = 0;
        int moreVowelThanConsonantCount = 0;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader file = new BufferedReader(new FileReader(fineName))) {
            String word;
            while ((word = file.readLine()) != null) {
                wordCount++;
                if (statistic.moreVowelThanConsonant(word)) {
                    sb.append(word + " ");
                    moreVowelThanConsonantCount++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        sb.append(String.format("%n%d/%d : %3.2f%%", moreVowelThanConsonantCount, wordCount,
                moreVowelThanConsonantCount * 100.0 / wordCount));
        return sb.toString();
    }
}
