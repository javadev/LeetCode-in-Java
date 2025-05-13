package g3501_3600.s3544_subtree_inversion_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subtreeInversionSum() {
        assertThat(
                new Solution()
                        .subtreeInversionSum(
                                new int[][] {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}},
                                new int[] {4, -8, -6, 3, 7, -2, 5},
                                2),
                equalTo(27L));
    }

    @Test
    void subtreeInversionSum2() {
        assertThat(
                new Solution()
                        .subtreeInversionSum(
                                new int[][] {{0, 1}, {1, 2}, {2, 3}, {3, 4}},
                                new int[] {-1, 3, -2, 4, -5},
                                2),
                equalTo(9L));
    }

    @Test
    void subtreeInversionSum3() {
        assertThat(
                new Solution()
                        .subtreeInversionSum(
                                new int[][] {{0, 1}, {0, 2}}, new int[] {0, -1, -2}, 3),
                equalTo(3L));
    }
}
