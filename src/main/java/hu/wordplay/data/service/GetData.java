package hu.wordplay.data.service;

import hu.wordplay.data.parse.DataParser;
import hu.wordplay.model.LadderWord;

import java.util.List;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public class GetData {

    /**
     * 2. feladat: Írja ki a képernyőre, hogy melyik a leghosszabb szó a szoveg.txt állományban,
     * és az hány karakterből áll!
     *
     * @return - a leghosszabb szó
     */
    public String getLongestWord() {
        return (String) Source.getData(Source.LONGEST);
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
    public String getWordStatistic() {
        return (String) Source.getData(Source.STATISTIC);
    }

    /**
     * 4-5. feladat: Gyűjtse ki a fájlban található ötkarakteres szavakat!
     *
     * @return lista az 5 kerekter hosszú szavakkal
     */
    public List<LadderWord> getFiveCharacterLongWords() {
        DataParser data = new DataParser();
        return data.parse((List<String>) Source.getData(Source.FIVE));
    }

}
