package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class baseballGame {
    private InputView inputView;
    private ResultView resultView;
    public static final int BALL_QUANTITY = 3;

    public static void play() {
        Balls answer = makeAnswer();
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
}
