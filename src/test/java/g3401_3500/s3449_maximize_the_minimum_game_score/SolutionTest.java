package g3401_3500.s3449_maximize_the_minimum_game_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(new Solution().maxScore(new int[] {2, 4}, 3), equalTo(4L));
    }

    @Test
    void maxScore2() {
        assertThat(new Solution().maxScore(new int[] {1, 2, 3}, 5), equalTo(2L));
    }
}
