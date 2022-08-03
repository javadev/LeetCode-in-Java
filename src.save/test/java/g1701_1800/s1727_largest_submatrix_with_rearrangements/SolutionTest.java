package g1701_1800.s1727_largest_submatrix_with_rearrangements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestSubmatrix() {
        assertThat(
                new Solution().largestSubmatrix(new int[][] {{0, 0, 1}, {1, 1, 1}, {1, 0, 1}}),
                equalTo(4));
    }

    @Test
    void largestSubmatrix2() {
        assertThat(new Solution().largestSubmatrix(new int[][] {{1, 0, 1, 0, 1}}), equalTo(3));
    }

    @Test
    void largestSubmatrix3() {
        assertThat(new Solution().largestSubmatrix(new int[][] {{1, 1, 0}, {1, 0, 1}}), equalTo(2));
    }
}
