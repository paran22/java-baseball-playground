package baseball.view;

import java.util.Scanner;

public class InputView {

    public static String inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요 : ");
        String input = scanner.nextLine();
        validator(input);
        return input;
    }

    public static void validator(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
        if (!input.trim().matches("^\\d{3}$")) {
            throw new IllegalArgumentException("숫자만 3자리 입력해주세요.");
        }
    }
}
