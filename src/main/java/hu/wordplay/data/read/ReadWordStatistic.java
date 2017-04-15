package hu.wordplay.data.read;

import hu.wordplay.data.service.Source;
import hu.wordplay.data.service.WordStatistic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public class ReadWordStatistic implements DataRead {

    private final WordStatistic statistic;

    public ReadWordStatistic() {
        statistic = new WordStatistic();
    }

    /**
     * 3. feladat: A magyar nyelv szavaiban általában kevesebb a magánhangzó, mint a mássalhangzó.
     * Határozza meg, hogy az állomány mely szavaiban van több magánhangzó, mint egyéb karakter!
     * Ezeket a szavakat írja ki a képernyőre egy-egy szóközzel elválasztva!
     * A szavak felsorolása után a mintának megfelelően az alábbi adatokat adja meg:
     * • hány szót talált;
     * • hány szó van összesen az állományban;
     * • a talált szavak hány százalékát teszik ki az összes szónak!
     * A százalékot két tizedessel szerepeltesse!
     * Például: 130/3000 : 4,33%
     *
     * @return String - Például: "130/3000 : 4,33%"
     */
    @Override
    public Object read() {
        int wordCount = 0;
        int moreVowelThanConsonantCount = 0;
        StringBuilder sb = new StringBuilder();
        try (BufferedReader file = new BufferedReader(new FileReader(Source.INPUT))) {
            String word;
            while ((word = file.readLine()) != null) {
                wordCount++;
                if (statistic.moreVowelThanConsonant(word)) {
                    sb.append(word).append(" ");
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
