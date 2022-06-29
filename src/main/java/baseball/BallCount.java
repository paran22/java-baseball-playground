package baseball;

public class BallCount {
    int strikeCount;
    int ballCount;

    public BallCount() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public int getBallCount() {
        return ballCount;
    }

    private void plusStrikeCount() {
        this.strikeCount += 1;
    }

    public void plusBallCount() {
        this.ballCount += 1;
    }

    public void changeBallCountByResult(MatchResult result) {
        if (result.isStrike()) {
            this.plusStrikeCount();
        }
        if (result.isBall()) {
            this.plusBallCount();
        }
    }
}
