package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static baseball.Balls.*;
import static org.junit.jupiter.api.Assertions.*;

class BallsTest {


    @Test
    void ballCount() {
        List<Ball> answers = new ArrayList<>();
        answers.add(new Ball(1, 7));
        answers.add(new Ball(2, 1));
        answers.add(new Ball(3, 3));
        Balls answer = new Balls(answers);

        List<Ball> inputs = new ArrayList<>();
        inputs.add(new Ball(1, 1));
        inputs.add(new Ball(2, 2));
        inputs.add(new Ball(3, 3));
        Balls input = new Balls(inputs);

        BallCount ballCount = answer.match(input);

        Assertions.assertThat(ballCount.getStrikeCount()).isEqualTo(1);
        Assertions.assertThat(ballCount.getBallCount()).isEqualTo(1);
    }

    @Test
    void checkAnswerBallsSize() {
        Balls answer = makeAnswer();
        Assertions.assertThat(answer.getBalls().size()).isEqualTo(BALL_QUANTITY);
    }

    @Test
    void checkInputBallsSize() {
        String input = "123";
        Balls inputBalls = makeInput(input);
        Assertions.assertThat(inputBalls.getBalls().size()).isEqualTo(BALL_QUANTITY);
        Assertions.assertThat(inputBalls.getBalls().get(1).getValue()).isEqualTo(2);
    }

    @Test
    void checkInput_ThrowExceptionCase1() {
        String input = "1234";
        assertThrows(IllegalArgumentException.class, () -> {
            Balls inputBalls = makeInput(input);
        });
    }

    @Test
    void checkInput_ThrowExceptionCase2() {
        String input = "104";
        assertThrows(IllegalArgumentException.class, () -> {
            Balls inputBalls = makeInput(input);
        });
    }
}