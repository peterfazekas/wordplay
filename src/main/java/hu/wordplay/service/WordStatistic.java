package hu.wordplay.service;

/**
 * Created by Péter on 2017.04.14..
 */
public class WordStatistic {

    private static final String VOWEL = "aeiou";

    private boolean isVowel(int ch) {
        return VOWEL.contains(String.valueOf((char) ch));
    }

    private long countVowel(String word) {
        return word.chars().filter(this::isVowel).count();
    }

    public boolean hasVowel(String word) {
        return countVowel(word) > 0;
    }

    public boolean moreVowelThanConsonant(String word) {
        return countVowel(word) * 2 > word.length();
    }

}
