package stringsCalculator;

import static stringsCalculator.Operator.*;

public class StringsCalculator {
    public static int calculator(String input) {
        String[] strings = input.split(" ");
        int result = Integer.parseInt(strings[0]);
        for (int i = 1; i < strings.length - 1; i += 2) {
            String sign = strings[i];
            if (isPlus(sign)) {
                result += Integer.parseInt(strings[i+1]);
            }
            if (isMinus(sign)) {
                result -= Integer.parseInt(strings[i+1]);
            }
            if (isDivision(sign)) {
                result /= Integer.parseInt(strings[i+1]);
            }
            if (Operator.isMultiply(sign)) {
                result *= Integer.parseInt(strings[i+1]);
            }
        }
        return result;
    }
}
