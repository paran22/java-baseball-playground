package baseball;

public enum MatchResult {
    BALL,
    STRIKE,
    NOTHING;


    public boolean isStrike() {
        return this.equals(STRIKE);
    }

    public boolean isBall() {
        return this.equals(BALL);
    }
}
