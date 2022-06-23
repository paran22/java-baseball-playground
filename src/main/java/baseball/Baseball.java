package baseball;

import java.awt.print.Pageable;

import static baseball.view.InputView.inputNumber;
import static baseball.view.ResultView.*;

public class Baseball {
    public final static int QUANTITY_OF_BALL = 3;

    public static void play() {
        Balls answer = Balls.createAnswer();
        int strikeCnt = 0;
        while (strikeCnt != QUANTITY_OF_BALL) {
            String input = inputNumber();
            BallNumber ballNumber = BallNumber.getBallNumber(answer, input);
            printResult(ballNumber);
            strikeCnt = ballNumber.getStrikeCnt();
        }
        ending();
    }

    private static void ending() {
        printEndingMsg();
        String input = chooseEndOrRestart();
        if (input.equals("1")) {
            play();
        }
    }
}
