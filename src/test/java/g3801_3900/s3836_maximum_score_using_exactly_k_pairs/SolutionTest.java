package g3801_3900.s3836_maximum_score_using_exactly_k_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(
                new Solution().maxScore(new int[] {1, 3, 2}, new int[] {4, 5, 1}, 2), equalTo(22L));
    }

    @Test
    void maxScore2() {
        assertThat(
                new Solution().maxScore(new int[] {-2, 0, 5}, new int[] {-3, 4, -1, 2}, 2),
                equalTo(26L));
    }

    @Test
    void maxScore3() {
        assertThat(new Solution().maxScore(new int[] {-3, -2}, new int[] {1, 2}, 2), equalTo(-7L));
    }
}
