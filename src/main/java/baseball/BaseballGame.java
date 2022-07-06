package baseball;

import static baseball.Balls.makeAnswer;
import static baseball.Balls.makeInput;
import static baseball.InputView.*;
import static baseball.ResultView.*;

public class BaseballGame {
    private InputView inputView;
    private ResultView resultView;


    public static void play() {
        Balls answer = makeAnswer();
        BallCount ballCount = new BallCount();
        System.out.println(answer);

        while (!ballCount.isAllMatch()) {
            try {
                Balls inputBalls = makeInput(getInputBalls());
                ballCount = answer.match(inputBalls);
                printResult(ballCount);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (ballCount.isAllMatch()) {
            printEnding();
            chooseEndOrRestart();
        }
    }

    private static void chooseEndOrRestart() {
        String choice = getChoice();
        if (choice.equals("1")) {
            play();
        }
    }


}
