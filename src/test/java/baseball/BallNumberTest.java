package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BallNumberTest {

    private Balls answer;

    @BeforeEach
    public void createAnswer() {
        List<Integer> answerForTest = new ArrayList<>();
        answerForTest.add(7);
        answerForTest.add(1);
        answerForTest.add(3);

        answer = new Balls(answerForTest);
    }

    @Test
    void getOnlyBallCnt() {
        String input = "145";
        BallNumber ballNumber = BallNumber.getBallNumber(answer, input);
        Assertions.assertThat(ballNumber.getBallCnt()).isEqualTo(1);
    }

    @Test
    void getOnlyStrikeCnt() {
        String input= "216";
        BallNumber ballNumber = BallNumber.getBallNumber(answer, input);
        Assertions.assertThat(ballNumber.getStrikeCnt()).isEqualTo(1);
    }

    @Test
    void getBallAndStrikeCnt() {
        String input= "123";
        BallNumber ballNumber = BallNumber.getBallNumber(answer, input);
        Assertions.assertThat(ballNumber.getBallCnt()).isEqualTo(1);
        Assertions.assertThat(ballNumber.getStrikeCnt()).isEqualTo(1);
    }

    @Test
    void throwExceptionWhenInputIsNull() {
        String input = null;
        Assertions.assertThatThrownBy(() -> BallNumber.getBallNumber(answer, input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionWhenInputIsEmpty() {
        String input = "";
        Assertions.assertThatThrownBy(() -> BallNumber.getBallNumber(answer, input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionWhenInputWithNotNumber() {
        String input = "1sg";
        Assertions.assertThatThrownBy(() -> BallNumber.getBallNumber(answer, input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionWhenInputSizeOverFour() {
        String input = "1234";
        Assertions.assertThatThrownBy(() -> BallNumber.getBallNumber(answer, input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void passValidatorWhenInputIncludesSpace() {
        String input = "123 ";
        Assertions.assertThatCode(() -> BallNumber.getBallNumber(answer, input)).doesNotThrowAnyException();
    }


}
