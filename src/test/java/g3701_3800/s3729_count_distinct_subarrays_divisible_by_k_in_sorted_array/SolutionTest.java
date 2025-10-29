package g3701_3800.s3729_count_distinct_subarrays_divisible_by_k_in_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numGoodSubarrays() {
        assertThat(new Solution().numGoodSubarrays(new int[] {1, 2, 3}, 3), equalTo(3L));
    }

    @Test
    void numGoodSubarrays2() {
        assertThat(new Solution().numGoodSubarrays(new int[] {2, 2, 2, 2, 2, 2}, 6), equalTo(2L));
    }
}
