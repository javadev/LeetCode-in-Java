package g2801_2900.s2871_split_array_into_maximum_number_of_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSubarrays() {
        assertThat(new Solution().maxSubarrays(new int[] {1, 0, 2, 0, 1, 2}), equalTo(3));
    }

    @Test
    void maxSubarrays2() {
        assertThat(new Solution().maxSubarrays(new int[] {5, 7, 1, 3}), equalTo(1));
    }

    @Test
    void maxSubarrays3() {
        assertThat(new Solution().maxSubarrays(new int[] {5}), equalTo(1));
    }
}
