package g3801_3900.s3835_count_subarrays_with_cost_less_than_or_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubarrays() {
        assertThat(new Solution().countSubarrays(new int[] {1, 3, 2}, 4), equalTo(5L));
    }

    @Test
    void countSubarrays2() {
        assertThat(new Solution().countSubarrays(new int[] {5, 5, 5, 5}, 0), equalTo(10L));
    }

    @Test
    void countSubarrays3() {
        assertThat(new Solution().countSubarrays(new int[] {1, 2, 3}, 0), equalTo(3L));
    }
}
