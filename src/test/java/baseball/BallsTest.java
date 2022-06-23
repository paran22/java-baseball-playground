package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BallsTest {

    private Balls answer;

    @BeforeEach
    void createAnswer() {
        answer = Balls.createAnswer();
    }

    @Test
    void checkAnswerSize() {
        Assertions.assertThat(answer.getBalls().size()).isEqualTo(3);
    }

    @Test
    void checkAnswerHaveOnlyDistinctNumbers() {
        Long sizeAfterRemoveDuplicatedNum = answer.getBalls().stream().distinct().count();
        Assertions.assertThat(sizeAfterRemoveDuplicatedNum).isEqualTo(3L);
    }

}