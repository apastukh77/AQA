package logic.entity;

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
}
