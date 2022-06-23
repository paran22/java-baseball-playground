package baseball.view;

import baseball.BallNumber;

import java.util.Scanner;

public class ResultView {

    public static void printResult(BallNumber ballNumber) {
        System.out.printf("%d볼 %d스트라이크%n", ballNumber.getBallCnt(), ballNumber.getStrikeCnt());
    }

    public static void printEndingMsg() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static String chooseEndOrRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        }
        return input;
    }
}
