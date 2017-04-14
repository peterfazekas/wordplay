package hu.wordplay.model;

/**
 * Created by Péter on 2017.04.14..
 */
public class LadderWord {

    private final String word;
    private final String ladder;
    private boolean canBeGrouped;

    public LadderWord(final String word) {
        this.word = word;
        ladder = word.substring(1, 4);
        canBeGrouped = false;
    }

    public boolean getWordIfLadderWord(final String ladder) {
        return this.ladder.equals(ladder);
    }

    public String getLadder() {
        return ladder;
    }

    public void setCanBeGrouped() {
        this.canBeGrouped = true;
    }

    public boolean canBeGrouped() {
        return canBeGrouped;
    }

    @Override
    public String toString() {
        return word;
    }
}
