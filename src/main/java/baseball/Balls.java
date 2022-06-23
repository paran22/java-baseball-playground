package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static baseball.Baseball.NUMBER_OF_BALLS;

public class Balls {
    private List<Integer> balls;

    public Balls(List<Integer> balls) {
        this.balls = balls;
    }
    public List<Integer> getBalls() {
        return balls;
    }

    public static Balls createAnswer() {
        Random random = new Random();
        List<Integer> answer = new ArrayList<>();
        while (answer.size() < NUMBER_OF_BALLS) {
            int ball = random.nextInt(10);
            if (!answer.contains(ball)) {
                answer.add(ball);
            }
        }
        return new Balls(answer);
    }
}
