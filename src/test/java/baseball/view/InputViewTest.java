package baseball.view;

import baseball.BallNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static baseball.view.InputView.validator;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    @Test
    void throwExceptionWhenInputIsNull() {
        String input = null;
        Assertions.assertThatThrownBy(() -> validator(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionWhenInputIsEmpty() {
        String input = "";
        Assertions.assertThatThrownBy(() -> validator(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionWhenInputWithNotNumber() {
        String input = "1sg";
        Assertions.assertThatThrownBy(() -> validator(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionWhenInputSizeOverFour() {
        String input = "1234";
        Assertions.assertThatThrownBy(() -> validator(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void passValidatorWhenInputIncludesSpace() {
        String input = "123 ";
        Assertions.assertThatCode(() -> validator(input)).doesNotThrowAnyException();
    }

}