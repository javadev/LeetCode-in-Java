package g2901_3000.s2918_minimum_equal_sum_of_two_arrays_after_replacing_zeros;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSum() {
        assertThat(
                new Solution().minSum(new int[] {3, 2, 0, 1, 0}, new int[] {6, 5, 0}),
                equalTo(12L));
    }

    @Test
    void minSum2() {
        assertThat(new Solution().minSum(new int[] {2, 0, 2, 0}, new int[] {1, 4}), equalTo(-1L));
    }

    @Test
    void minSum3() {
        assertThat(
                new Solution().minSum(new int[] {17, 1, 13, 12, 3, 13}, new int[] {2, 25}),
                equalTo(-1L));
    }

    @Test
    void minSum4() {
        assertThat(
                new Solution()
                        .minSum(
                                new int[] {9, 5},
                                new int[] {
                                    15, 12, 5, 21, 4, 26, 27, 9, 6, 29, 0, 18, 16, 0, 0, 0, 20
                                }),
                equalTo(-1L));
    }

    @Test
    void minSum5() {
        assertThat(
                new Solution()
                        .minSum(
                                new int[] {8, 13, 15, 18, 0, 18, 0, 0, 5, 20, 12, 27, 3, 14, 22, 0},
                                new int[] {29, 1, 6, 0, 10, 24, 27, 17, 14, 13, 2, 19, 2, 11}),
                equalTo(179L));
    }

    @Test
    void minSum6() {
        assertThat(
                new Solution().minSum(new int[] {1, 2, 3, 2}, new int[] {1, 2, 3, 2}), equalTo(8L));
    }

    @Test
    void minSum7() {
        assertThat(
                new Solution()
                        .minSum(
                                new int[] {
                                    14, 12, 27, 6, 6, 2, 25, 28, 30, 3, 6, 22, 15, 19, 27, 18, 27
                                },
                                new int[] {22, 12, 13, 1, 20, 0, 23, 26, 0, 8}),
                equalTo(287L));
    }

    @Test
    void minSum8() {
        assertThat(
                new Solution()
                        .minSum(
                                new int[] {0, 17, 20, 17, 5, 0, 14, 19, 7, 8, 16, 18, 6},
                                new int[] {
                                    21, 1, 27, 19, 2, 2, 24, 21, 16, 1, 13, 27, 8, 5, 3, 11, 13, 7,
                                    29, 7
                                }),
                equalTo(257L));
    }

    @Test
    void minSum9() {
        assertThat(
                new Solution().minSum(new int[] {3, 2, 0, 1, 0}, new int[] {6, 5, 0}),
                equalTo(12L));
    }
}
