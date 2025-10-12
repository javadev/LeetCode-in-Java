package g3701_3800.s3715_sum_of_perfect_square_ancestors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOfAncestors() {
        assertThat(
                new Solution().sumOfAncestors(3, new int[][] {{0, 1}, {1, 2}}, new int[] {2, 8, 2}),
                equalTo(3L));
    }

    @Test
    void sumOfAncestors2() {
        assertThat(
                new Solution().sumOfAncestors(3, new int[][] {{0, 1}, {0, 2}}, new int[] {1, 2, 4}),
                equalTo(1L));
    }

    @Test
    void sumOfAncestors3() {
        assertThat(
                new Solution()
                        .sumOfAncestors(
                                4, new int[][] {{0, 1}, {0, 2}, {1, 3}}, new int[] {1, 2, 9, 4}),
                equalTo(2L));
    }
}
