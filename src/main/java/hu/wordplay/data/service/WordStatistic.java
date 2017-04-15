package hu.wordplay.data.service;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public class WordStatistic {

    private static final String VOWEL = "aeiou";

    /**
     * 1. feladat: Kérjen be a felhasználótól egy szót, és döntse el, hogy tartalmaz-e magánhangzót!
     * Amennyiben tartalmaz, írja ki, hogy „Van benne magánhangzó.”! Ha nincs, akkor írja ki, hogy
     * „Nincs benne magánhangzó.”! A begépelendő szóról feltételezheti, hogy csak az angol ábécé
     * kisbetűit tartalmazza. (Az angol ábécé magánhangzói: a, e, i, o, u.)
     *
     * @param word - a bekért szó
     * @return - logika érték - Van-e a szóban magánhangzó
     */
    public boolean hasVowel(String word) {
        return countVowel(word) > 0;
    }

    /**
     * 3. feladat: A magyar nyelv szavaiban általában kevesebb a magánhangzó, mint a mássalhangzó.
     * Határozza meg, hogy az állomány mely szavaiban van több magánhangzó, mint egyéb karakter!
     *
     * @param word - a vizsgálandó szó
     * @return logikai
     */
    public boolean moreVowelThanConsonant(String word) {
        return countVowel(word) * 2 > word.length();
    }

    private long countVowel(String word) {
        return word.chars()
                .filter(this::isVowel)
                .count();
    }

    private boolean isVowel(int ch) {
        return VOWEL.contains(String.valueOf((char) ch));
    }

}
