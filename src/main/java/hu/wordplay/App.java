package hu.wordplay;

import hu.wordplay.data.log.DataLogger;
import hu.wordplay.data.log.FileDataLogger;
import hu.wordplay.data.service.GetData;
import hu.wordplay.data.service.WordStatistic;
import hu.wordplay.service.Console;
import hu.wordplay.service.WordLadder;

import java.util.Scanner;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
class App {

    private static final String LOGFILE = "letra.txt";
    private final Console console;
    private final WordStatistic statistic;
    private final GetData data;
    private final WordLadder wordLadder;
    private final DataLogger log;

    private App() {
        statistic = new WordStatistic();
        data = new GetData();
        wordLadder = new WordLadder(data.getFiveCharacterLongWords());
        console = new Console(new Scanner(System.in));
        log = new FileDataLogger(LOGFILE);
    }

    public static void main(String[] args) {
        App app = new App();
        app.println();
    }

    private void println() {
        System.out.print("1. feladat: Adjon meg egy szót: ");
        System.out.println(statistic.hasVowel(console.read()) ? "Van benne magánhangzó." : "Nincs benne magánhangzó.");
        System.out.println("2. feladat: A szövegben a leghosszabb szó: " + data.getLongestWord());
        System.out.println("3. feladat: Szöveg statisztika: " + data.getWordStatistic());
        System.out.print("4. feladat: Adjon meg egy 3 betűs szórészletet: ");
        System.out.println(wordLadder.getWords(console.read()));
        log.printAll(wordLadder.createLadder());
    }
}
