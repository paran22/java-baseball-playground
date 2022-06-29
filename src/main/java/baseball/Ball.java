package baseball;

public class Ball {
    private int position;
    private int value;

    public Ball(int position, int value) {
        this.position = position;
        this.value = value;
    }

    public int getPosition() {
        return position;
    }

    public int getValue() {
        return value;
    }

    public MatchResult getMatchResult(Ball input) {
        if (position == input.getPosition() && value == input.getValue()) {
            return MatchResult.STRIKE;
        }
        if (position != input.getPosition() && value == input.getValue()) {
            return MatchResult.BALL;
        }
        return MatchResult.NOTHING;
    }
}
