package baseball;

import java.util.List;

public class Balls {
    private List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public BallCount match(Balls input) {
        BallCount ballCount = new BallCount();
        for (Ball ball : balls) {
            for (Ball inputBall : input.getBalls()) {
                MatchResult result = ball.getMatchResult(inputBall);
                ballCount.changeBallCountByResult(result);
            }
        }
        return ballCount;
    }
}
