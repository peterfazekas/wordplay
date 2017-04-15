package hu.wordplay.data.service;

import hu.wordplay.data.read.DataRead;
import hu.wordplay.data.read.ReadFiveCharacterLongWords;
import hu.wordplay.data.read.ReadLongestWord;
import hu.wordplay.data.read.ReadWordStatistic;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public enum Source {

    LONGEST(ReadLongestWord.class),
    STATISTIC(ReadWordStatistic.class),
    FIVE(ReadFiveCharacterLongWords.class);

    private static final String FILE = "szoveg.txt";
    public static final String PATH = "src\\main\\resources\\";
    public static final String INPUT = PATH + FILE;

    private final Class<? extends DataRead> instance;

    Source(Class<? extends DataRead> instance) {
        this.instance = instance;
    }

    private static DataRead newInstance(Source source) {
        DataRead dataRead = null;
        try {
            dataRead = source.instance.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return dataRead;
    }

    public static Object getData(Source source) {
        DataRead file = newInstance(source);
        return file.read();
    }

}
