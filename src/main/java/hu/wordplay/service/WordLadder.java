package hu.wordplay.service;

import hu.wordplay.model.LadderWord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Péter on 2017.04.14..
 */
public class WordLadder {

    public static final String SPEARATOR = " ";
    private final List<LadderWord> wordList;

    public WordLadder(final List<LadderWord> wordList) {
        this.wordList = wordList;
    }

    public String getWords(final String ladder) {
        StringBuilder sb = new StringBuilder();
        wordList.stream()
                .filter(word -> word.getWordIfLadderWord(ladder))
                .map(word -> word + SPEARATOR)
                .forEach(sb::append);
        return sb.toString();
    }

    private List<LadderWord> filterList() {
        return wordList.stream()
                .filter(word -> !isSingle(getWords(word.getLadder())))
                .collect(Collectors.toList());
    }

    private boolean isSingle(String word) {
        return word.length() == 6;
    }

    private Set<String> createLadderSet() {
        List<LadderWord> collect = filterList();
        return collect.stream()
                .map(word -> getWords(word.getLadder()))
                .collect(Collectors.toSet());
    }

    public List<String> createLadder() {
        List<String> text = new ArrayList<>();
        Set<String> ladderSet = createLadderSet();
        ladderSet.forEach(ladder -> {
            text.addAll(Arrays.asList(ladder.split(SPEARATOR)));
            text.add(SPEARATOR);
        });
        return text;
    }

}
