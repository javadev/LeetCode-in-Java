package g2501_2600.s2542_maximum_subsequence_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(
                new Solution().maxScore(new int[] {1, 3, 3, 2}, new int[] {2, 1, 3, 4}, 3),
                equalTo(12L));
    }

    @Test
    void maxScore2() {
        assertThat(
                new Solution().maxScore(new int[] {4, 2, 3, 1, 1}, new int[] {7, 5, 10, 9, 6}, 1),
                equalTo(30L));
    }
}
