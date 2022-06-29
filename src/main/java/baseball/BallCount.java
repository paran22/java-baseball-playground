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

    public void plusStrikeCount() {
        this.ballCount += 1;
    }

    public void plusBallCount() {
        this.ballCount += 1;
    }
}
