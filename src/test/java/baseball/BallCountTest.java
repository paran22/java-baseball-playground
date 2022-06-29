package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallCountTest {

    private BallCount ballCount;

    @BeforeEach
    void createBallCount() {
        ballCount = new BallCount();
    }

    @Test
    void plusStrikeCountTest() {
        ballCount.plusStrikeCount();
        Assertions.assertThat(ballCount.getStrikeCount()).isEqualTo(1);
    }

    @Test
    void plusBallCountTest() {
        ballCount.plusStrikeCount();
        Assertions.assertThat(ballCount.getBallCount()).isEqualTo(1);
    }

}