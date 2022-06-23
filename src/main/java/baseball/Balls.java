package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
        while (answer.size() < 3) {
            int ball = random.nextInt(10);
            if (!answer.contains(ball)) {
                answer.add(ball);
            }
        }
        return new Balls(answer);
    }
}
