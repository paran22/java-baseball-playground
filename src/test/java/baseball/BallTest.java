package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BallTest {

    private Ball answer;

    @BeforeEach
    void makeAnswer() {
        answer = new Ball(1, 1);
    }
    @Test
    void strike() {
        Ball input = new Ball(1, 1);
        Assertions.assertThat(answer.getMatchResult(input)).isEqualTo(MatchResult.STRIKE);
    }

    @Test
    void ball() {
        Ball input = new Ball(2, 1);
        Assertions.assertThat(answer.getMatchResult(input)).isEqualTo(MatchResult.BALL);
    }

    @Test
    void nothing() {
        Ball input = new Ball(3, 4);
        Assertions.assertThat(answer.getMatchResult(input)).isEqualTo(MatchResult.NOTHING);
    }
}