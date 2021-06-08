package logic.strings;

import java.util.Objects;

/**
 * @author Serhiy Dubovenko
 */
public class CharInfo {

    private char character;
    private int count;
    private double percent;

    public CharInfo() {
    }

    public CharInfo(char character, int count, double percent) {
        this.character = character;
        this.count = count;
        this.percent = percent;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "CharInfo{" +
                "character=" + character +
                ", count=" + count +
                ", percent=" + percent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharInfo charInfo = (CharInfo) o;
        return character == charInfo.character && count == charInfo.count && Double.compare(charInfo.percent, percent) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(character, count, percent);
    }
}
