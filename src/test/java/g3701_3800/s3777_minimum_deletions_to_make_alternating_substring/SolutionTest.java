package g3701_3800.s3777_minimum_deletions_to_make_alternating_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDeletions() {
        assertThat(
                new Solution().minDeletions("ABA", new int[][] {{2, 1, 2}, {1, 1}, {2, 0, 2}}),
                equalTo(new int[] {0, 2}));
    }

    @Test
    void minDeletions2() {
        assertThat(
                new Solution().minDeletions("ABB", new int[][] {{2, 0, 2}, {1, 2}, {2, 0, 2}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void minDeletions3() {
        assertThat(
                new Solution().minDeletions("BABA", new int[][] {{2, 0, 3}, {1, 1}, {2, 1, 3}}),
                equalTo(new int[] {1, 0}));
    }
}
