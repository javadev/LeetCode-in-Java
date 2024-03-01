package g1501_1600.s1566_detect_pattern_of_length_m_repeated_k_or_more_times;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void containsPattern() {
        assertThat(
                new Solution().containsPattern(new int[] {1, 2, 4, 4, 4, 4}, 1, 3), equalTo(true));
    }

    @Test
    void containsPattern2() {
        assertThat(
                new Solution().containsPattern(new int[] {1, 2, 1, 2, 1, 1, 1, 3}, 2, 2),
                equalTo(true));
    }

    @Test
    void containsPattern3() {
        assertThat(
                new Solution().containsPattern(new int[] {1, 2, 1, 2, 1, 3}, 2, 3), equalTo(false));
    }
}
