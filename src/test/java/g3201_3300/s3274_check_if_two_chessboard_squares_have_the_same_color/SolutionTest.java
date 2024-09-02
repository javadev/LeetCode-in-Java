package g3201_3300.s3274_check_if_two_chessboard_squares_have_the_same_color;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkTwoChessboards() {
        assertThat(new Solution().checkTwoChessboards("a1", "c3"), equalTo(true));
    }

    @Test
    void checkTwoChessboards2() {
        assertThat(new Solution().checkTwoChessboards("a1", "h3"), equalTo(false));
    }
}
