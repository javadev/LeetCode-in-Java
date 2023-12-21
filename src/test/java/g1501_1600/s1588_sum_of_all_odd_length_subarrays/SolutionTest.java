package g1501_1600.s1588_sum_of_all_odd_length_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumOddLengthSubarrays() {
        assertThat(new Solution().sumOddLengthSubarrays(new int[] {1, 4, 2, 5, 3}), equalTo(58));
    }

    @Test
    void sumOddLengthSubarrays2() {
        assertThat(new Solution().sumOddLengthSubarrays(new int[] {1, 2}), equalTo(3));
    }
}
