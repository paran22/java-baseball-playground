package baseball;

import static baseball.Baseball.QUANTITY_OF_BALL;

public class BallNumber {
    private int ballCnt;
    private int strikeCnt;

    public BallNumber(int ballCnt, int strikeCnt) {
        this.ballCnt = ballCnt;
        this.strikeCnt = strikeCnt;
    }

    public int getBallCnt() {
        return ballCnt;
    }

    public int getStrikeCnt() {
        return strikeCnt;
    }

    public static BallNumber getBallNumber(Balls answer, String input) {
        validator(input);
        String[] inputs = input.trim().split("");

        int ballCnt = 0;
        int strikeCnt = 0;

        for (int i = 0; i < QUANTITY_OF_BALL; i++) {
            if (Integer.parseInt(inputs[i]) == answer.getBalls().get(i)) {
                strikeCnt++;
                continue;
            }
            for (int j = 0; j < QUANTITY_OF_BALL; j++) {
                if (Integer.parseInt(inputs[i]) == answer.getBalls().get(j)) {
                    ballCnt++;
                }
            }
        }

        return new BallNumber(ballCnt, strikeCnt);
    }

    private static void validator(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("숫자를 입력해주세요.");
        }
        if (!input.trim().matches("^\\d{3}$")) {
            throw new IllegalArgumentException("숫자만 3자리 입력해주세요.");
        }
    }
}
