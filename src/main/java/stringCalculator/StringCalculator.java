package stringCalculator;

public class StringCalculator {
    public static int calculate(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("계산식을 입력하세요");
        }
        String[] values = input.split(" ");

        if (!input.matches("^\\d.*")) {
            throw new IllegalArgumentException("계산식은 숫자로 시작해야합니다.");
        }
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            if (values[i].equals("+")) {
                result += Integer.parseInt(values[i+1]);
            }
            if (values[i].equals("-")) {
                result -= Integer.parseInt(values[i+1]);
            }
            if (values[i].equals("*")) {
                result *= Integer.parseInt(values[i+1]);
            }
            if (values[i].equals("/")) {
                result /= Integer.parseInt(values[i+1]);
            }
        }

        return result;
    }
}
