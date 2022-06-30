package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static baseball.baseballGame.BALL_QUANTITY;
import static baseball.baseballGame.makeAnswer;
import static org.junit.jupiter.api.Assertions.*;

class baseballGameTest {

    @Test
    void checkAnswerBallsSize() {
        Balls answer = makeAnswer();
        Assertions.assertThat(answer.getBalls().size()).isEqualTo(BALL_QUANTITY);
    }

}