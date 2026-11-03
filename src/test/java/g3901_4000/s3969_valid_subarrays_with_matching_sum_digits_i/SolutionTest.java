package g3901_4000.s3969_valid_subarrays_with_matching_sum_digits_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countValidSubarrays() {
        assertThat(new Solution().countValidSubarrays(new int[] {1, 100, 1}, 1), equalTo(4));
    }

    @Test
    void countValidSubarrays2() {
        assertThat(new Solution().countValidSubarrays(new int[] {1}, 2), equalTo(0));
    }

    @Test
    void countValidSubarrays3() {
        assertThat(new Solution().countValidSubarrays(new int[] {2, 20, 2}, 2), equalTo(4));
    }
}
