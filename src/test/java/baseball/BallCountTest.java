package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BallCountTest {

    private BallCount ballCount;

    @BeforeEach
    void createBallCount() {
        ballCount = new BallCount();
    }

    @Test
    void plusStrikeCountTest() {
        MatchResult result = MatchResult.STRIKE;
        ballCount.changeBallCountByResult(result);
        Assertions.assertThat(ballCount.getStrikeCount()).isEqualTo(1);
    }

    @Test
    void plusBallCountTest() {
        MatchResult result = MatchResult.BALL;
        ballCount.changeBallCountByResult(result);
        Assertions.assertThat(ballCount.getBallCount()).isEqualTo(1);
    }

    @Test
    void nothingTest() {
        MatchResult result = MatchResult.NOTHING;
        ballCount.changeBallCountByResult(result);
        Assertions.assertThat(ballCount.getBallCount()).isEqualTo(0);
        Assertions.assertThat(ballCount.getStrikeCount()).isEqualTo(0);
    }

}