package hu.wordplay.data.service;

import hu.wordplay.data.parse.DataParser;
import hu.wordplay.data.read.DataRead;
import hu.wordplay.data.read.ReadFiveCharacterLongWords;
import hu.wordplay.data.read.ReadLongestWord;
import hu.wordplay.data.read.ReadWordStatistic;
import hu.wordplay.model.LadderWord;

import java.util.List;

/**
 * Created by Péter on 2017.04.14..
 */
public class GetData {

    public String getLongestWord() {
        return (String)Source.getData(Source.LONGEST);
    }

    public String getWordStatistic() {
        return (String)Source.getData(Source.STATISTIC);
    }

    public List<LadderWord> getFiveCharacterLongWords() {
        DataParser data = new DataParser();
        return data.parse((List<String>)Source.getData(Source.FIVE));
    }

}
