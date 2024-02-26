package g1501_1600.s1524_number_of_sub_arrays_with_odd_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numOfSubarrays() {
        assertThat(new Solution().numOfSubarrays(new int[] {1, 3, 5}), equalTo(4));
    }

    @Test
    void numOfSubarrays2() {
        assertThat(new Solution().numOfSubarrays(new int[] {2, 4, 6}), equalTo(0));
    }

    @Test
    void numOfSubarrays3() {
        assertThat(new Solution().numOfSubarrays(new int[] {1, 2, 3, 4, 5, 6, 7}), equalTo(16));
    }
}
