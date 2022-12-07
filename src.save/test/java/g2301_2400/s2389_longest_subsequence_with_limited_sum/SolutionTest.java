package g2301_2400.s2389_longest_subsequence_with_limited_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void answerQueries() {
        assertThat(
                new Solution().answerQueries(new int[] {4, 5, 2, 1}, new int[] {3, 10, 21}),
                equalTo(new int[] {2, 3, 4}));
    }

    @Test
    void answerQueries2() {
        assertThat(
                new Solution().answerQueries(new int[] {2, 3, 4, 5}, new int[] {1}),
                equalTo(new int[] {0}));
    }
}
