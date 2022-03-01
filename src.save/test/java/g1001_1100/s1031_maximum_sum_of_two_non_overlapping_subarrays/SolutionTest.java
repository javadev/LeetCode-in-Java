package g1001_1100.s1031_maximum_sum_of_two_non_overlapping_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumTwoNoOverlap() {
        assertThat(
                new Solution().maxSumTwoNoOverlap(new int[] {0, 6, 5, 2, 2, 5, 1, 9, 4}, 1, 2),
                equalTo(20));
    }

    @Test
    void maxSumTwoNoOverlap2() {
        assertThat(
                new Solution().maxSumTwoNoOverlap(new int[] {3, 8, 1, 3, 2, 1, 8, 9, 0}, 3, 2),
                equalTo(29));
    }

    @Test
    void maxSumTwoNoOverlap3() {
        assertThat(
                new Solution().maxSumTwoNoOverlap(new int[] {2, 1, 5, 6, 0, 9, 5, 0, 3, 8}, 4, 3),
                equalTo(31));
    }
}
