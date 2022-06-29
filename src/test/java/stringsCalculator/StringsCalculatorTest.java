package stringsCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static stringsCalculator.StringsCalculator.*;

class StringsCalculatorTest {

    @Test
    void strings_calculator_test() {
        String input = "2 + 3 * 4 / 2";
        int result = calculator(input);
        Assertions.assertThat(result).isEqualTo(10);
    }

}