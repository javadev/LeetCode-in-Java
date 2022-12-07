package g2301_2400.s2395_find_subarrays_with_equal_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSubarrays() {
        assertThat(new Solution().findSubarrays(new int[] {4, 2, 4}), equalTo(true));
    }

    @Test
    void findSubarrays2() {
        assertThat(new Solution().findSubarrays(new int[] {1, 2, 3, 4, 5}), equalTo(false));
    }

    @Test
    void findSubarrays3() {
        assertThat(new Solution().findSubarrays(new int[] {0, 0, 0}), equalTo(true));
    }
}
