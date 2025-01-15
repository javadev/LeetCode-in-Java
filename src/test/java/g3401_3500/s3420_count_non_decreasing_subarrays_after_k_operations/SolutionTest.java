package g3401_3500.s3420_count_non_decreasing_subarrays_after_k_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countNonDecreasingSubarrays() {
        assertThat(
                new Solution().countNonDecreasingSubarrays(new int[] {6, 3, 1, 2, 4, 4}, 7),
                equalTo(17L));
    }

    @Test
    void countNonDecreasingSubarrays2() {
        assertThat(
                new Solution().countNonDecreasingSubarrays(new int[] {6, 3, 1, 3, 6}, 4),
                equalTo(12L));
    }
}
