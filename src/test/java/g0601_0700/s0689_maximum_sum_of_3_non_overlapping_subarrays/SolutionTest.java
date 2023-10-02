package g0601_0700.s0689_maximum_sum_of_3_non_overlapping_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSumOfThreeSubarrays() {
        assertThat(
                new Solution().maxSumOfThreeSubarrays(new int[] {1, 2, 1, 2, 6, 7, 5, 1}, 2),
                equalTo(new int[] {0, 3, 5}));
    }

    @Test
    void maxSumOfThreeSubarrays2() {
        assertThat(
                new Solution().maxSumOfThreeSubarrays(new int[] {1, 2, 1, 2, 1, 2, 1, 2, 1}, 2),
                equalTo(new int[] {0, 2, 4}));
    }
}
