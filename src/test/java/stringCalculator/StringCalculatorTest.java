package stringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    @Test
    void string_calculate() {
        String input = "2 + 3 * 4 / 2";
        Assertions.assertThat(StringCalculator.calculate(input)).isEqualTo(10);
    }

    @Test
    void throwExceptionIfInputIsNull() {
        String input = null;
        Assertions.assertThatThrownBy(() -> StringCalculator.calculate(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionIfInputIsEmpty() {
        String input = "";
        Assertions.assertThatThrownBy(() -> StringCalculator.calculate(input)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionIfInputNotStartWithNumber() {
        String input = "as2";
        Assertions.assertThatThrownBy(() -> StringCalculator.calculate(input)).isInstanceOf(IllegalArgumentException.class);
    }



}