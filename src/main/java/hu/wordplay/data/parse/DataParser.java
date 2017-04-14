package hu.wordplay.data.parse;

import hu.wordplay.model.LadderWord;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Péter on 2017.04.14..
 */
public class DataParser {

    public List<LadderWord> parse(final List<String> words) {
        return words.stream()
                .map(LadderWord::new)
                .collect(Collectors.toList());
    }

}
