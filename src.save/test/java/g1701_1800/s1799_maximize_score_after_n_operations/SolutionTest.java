package g1701_1800.s1799_maximize_score_after_n_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(new Solution().maxScore(new int[] {1, 2}), equalTo(1));
    }

    @Test
    void maxScore2() {
        assertThat(new Solution().maxScore(new int[] {3, 4, 6, 8}), equalTo(11));
    }

    @Test
    void maxScore3() {
        assertThat(new Solution().maxScore(new int[] {1, 2, 3, 4, 5, 6}), equalTo(14));
    }
}
