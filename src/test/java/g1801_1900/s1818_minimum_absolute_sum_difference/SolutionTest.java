package g1801_1900.s1818_minimum_absolute_sum_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAbsoluteSumDiff() {
        assertThat(
                new Solution().minAbsoluteSumDiff(new int[] {1, 7, 5}, new int[] {2, 3, 5}),
                equalTo(3));
    }

    @Test
    void minAbsoluteSumDiff2() {
        assertThat(
                new Solution()
                        .minAbsoluteSumDiff(new int[] {2, 4, 6, 8, 10}, new int[] {2, 4, 6, 8, 10}),
                equalTo(0));
    }

    @Test
    void minAbsoluteSumDiff3() {
        assertThat(
                new Solution()
                        .minAbsoluteSumDiff(
                                new int[] {1, 10, 4, 4, 2, 7}, new int[] {9, 3, 5, 1, 7, 4}),
                equalTo(20));
    }
}
