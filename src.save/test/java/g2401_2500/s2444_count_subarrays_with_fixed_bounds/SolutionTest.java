package g2401_2500.s2444_count_subarrays_with_fixed_bounds;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubarrays() {
        assertThat(new Solution().countSubarrays(new int[] {1, 3, 5, 2, 7, 5}, 1, 5), equalTo(2L));
    }

    @Test
    void countSubarrays2() {
        assertThat(new Solution().countSubarrays(new int[] {1, 1, 1, 1}, 1, 1), equalTo(10L));
    }
}
