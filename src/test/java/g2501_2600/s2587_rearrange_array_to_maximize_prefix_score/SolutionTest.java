package g2501_2600.s2587_rearrange_array_to_maximize_prefix_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(new Solution().maxScore(new int[] {2, -1, 0, 1, -3, 3, -3}), equalTo(6));
    }

    @Test
    void maxScore2() {
        assertThat(new Solution().maxScore(new int[] {-2, -3, 0}), equalTo(0));
    }
}
