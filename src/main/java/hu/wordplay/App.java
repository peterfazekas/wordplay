package hu.wordplay;

import hu.wordplay.service.WordStatistic;

/**
 * Created by Péter on 2017.04.14..
 */
public class App {

    private final WordStatistic statistic;

    public App() {
        statistic = new WordStatistic();
    }

    public static void main(String[] args) {
        App app = new App();
        app.println();
    }

    private void println() {
        System.out.println(statistic.hasVowel("Hmmm"));
        System.out.println(statistic.hasVowel("Szia"));
        System.out.println(statistic.hasVowel("aeiok"));
        System.out.println(statistic.moreVowelThanConsonant("Szia"));
        System.out.println(statistic.moreVowelThanConsonant("aeiok"));

    }
}
