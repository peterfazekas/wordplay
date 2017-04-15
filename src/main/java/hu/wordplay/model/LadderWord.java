package hu.wordplay.model;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public class LadderWord {

    private final String word;
    private final String ladder;

    public LadderWord(final String word) {
        this.word = word;
        ladder = word.substring(1, 4);
    }

    public boolean getWordIfLadderWord(final String ladder) {
        return this.ladder.equals(ladder);
    }

    public String getLadder() {
        return ladder;
    }

    @Override
    public String toString() {
        return word;
    }
}
