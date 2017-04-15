package hu.wordplay.service;

import hu.wordplay.model.LadderWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public class WordLadder {

    private static final String SEPARATOR = " ";
    private static final int SINGLE_LENGTH = 6;
    private final List<LadderWord> wordList;

    public WordLadder(final List<LadderWord> wordList) {
        this.wordList = wordList;
    }

    /**
     * 4. feladat: Kérjen be a felhasználótól egy 3 karakteres szórészletet!
     * Írja ki a képernyőre a szólétra építés szabályai szerint hozzá tartozó ötkarakteres szavakat
     * a tárolt adathalmazból! A kiírásnál a szavakat egy-egy szóköz válassza el!
     *
     * @param ladder - a létreszó - az adott szó középső 3 betűje.
     * @return - a megtalált szavak
     */
    public String getWords(final String ladder) {
        StringBuilder sb = new StringBuilder();
        wordList.stream()
                .filter(word -> word.getWordIfLadderWord(ladder))
                .map(word -> word + SEPARATOR)
                .forEach(sb::append);
        return sb.toString();
    }

    /**
     * 5. feladat: Az eltárolt ötkarakteres szavakból csoportosítsa azokat a szavakat,
     * melyek ugyanannak a hárombetűs szórészletnek a létraszavai!
     * Hozzon létre egy letra.txt állományt, amelybe ezeket a szavakat írja az alábbiak szerint:
     * • minden szó külön sorba kerüljön;
     * • csak olyan szó szerepeljen az állományban, aminek van legalább egy párja,
     * amivel egy létrát alkotnak (azaz első és utolsó karakter nélkül megegyeznek);
     * • az egy létrához tartozó szavak közvetlenül egymás után helyezkedjenek el;
     * • két létra szavai között egy üres elválasztó sor legyen!
     *
     * @return - a letra.txt allomány tartalma String listaként!
     */

    public List<String> createLadder() {
        List<String> text = new ArrayList<>();
        createLadderSet().forEach(ladder -> {
            text.addAll(Arrays.asList(ladder.split(SEPARATOR)));
            text.add(SEPARATOR);
        });
        return text;
    }

    private Set<String> createLadderSet() {
        return filterList().stream()
                .map(word -> getWords(word.getLadder()))
                .collect(Collectors.toSet());
    }

    private List<LadderWord> filterList() {
        return wordList.stream()
                .filter(word -> !isSingle(getWords(word.getLadder())))
                .collect(Collectors.toList());
    }

    private boolean isSingle(String word) {
        return word.length() == SINGLE_LENGTH;
    }

}
