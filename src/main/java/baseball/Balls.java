package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Balls {
    private List<Ball> balls;
    public static final int BALL_QUANTITY = 3;

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

    public static Balls makeAnswer() {
        Random random = new Random();
        List<Integer> values = new ArrayList<>();

        while (values.size() < BALL_QUANTITY) {
            int value = random.nextInt(10);
            if (isNotDuplicated(values, value)) {
                values.add(value);
            }
        }

        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < BALL_QUANTITY; i++) {
            Ball ball = new Ball(i, values.get(i));
            balls.add(ball);
        }
        return new Balls(balls);
    }

    private static boolean isNotDuplicated(List<Integer> values, int value) {
        return !values.contains(value);
    }

    public static Balls makeInput(String input) {
        if (!isOneToNineAndBallQuantity(input)) {
            throw new IllegalArgumentException("숫자는 1~9까지 3자리수로 입력해주세요");
        }

        String[] array = input.split("");
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < BALL_QUANTITY; i++) {
            balls.add(new Ball(i, Integer.parseInt(array[i])));
        }
        return new Balls(balls);
    }

    private static boolean isOneToNineAndBallQuantity(String input) {
        return input.matches("^[1-9]{3}$");
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Ball ball : balls) {
            output.append(ball.getValue());
        }
        return output.toString();
    }
}
