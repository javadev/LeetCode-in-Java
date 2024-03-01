package g2901_3000.s2968_apply_operations_to_maximize_frequency_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFrequencyScore() {
        assertThat(new Solution().maxFrequencyScore(new int[] {1, 2, 6, 4}, 3), equalTo(3));
    }

    @Test
    void maxFrequencyScore2() {
        assertThat(new Solution().maxFrequencyScore(new int[] {1, 4, 4, 2, 4}, 0), equalTo(3));
    }
}
