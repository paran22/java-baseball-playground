package baseball;

import java.util.Scanner;

public class InputView {
    public static String getInputBalls() {
        System.out.println("숫자를 입력해 주세요 : ");
        return getInput();
    }

    public static String getChoice() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return getInput();
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
