package baseball;

public class ResultView {
    public static void printResult(BallCount ballCount) {
        int ball = ballCount.getBallCount();
        int strike = ballCount.getStrikeCount();
        if (ballCount.isOnlyBall()) {
            System.out.printf("%d볼%n", ball);
            return;
        }
        if (ballCount.isOnlyStrike()) {
            System.out.printf("%d스트라이크%n", strike);
            return;
        }
        if (ballCount.isNothing()) {
            System.out.println("낫싱");
            return;
        }
        System.out.printf("%d볼 %d스트라이크%n", ball, strike);
    }

    public static void printEnding() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
