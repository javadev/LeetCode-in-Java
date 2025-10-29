package g3701_3800.s3728_stable_subarrays_with_equal_boundary_and_interior_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countStableSubarrays() {
        assertThat(new Solution().countStableSubarrays(new int[] {9, 3, 3, 3, 9}), equalTo(2L));
    }

    @Test
    void countStableSubarrays2() {
        assertThat(new Solution().countStableSubarrays(new int[] {1, 2, 3, 4, 5}), equalTo(0L));
    }

    @Test
    void countStableSubarrays3() {
        assertThat(
                new Solution().countStableSubarrays(new int[] {-4, 4, 0, 0, -8, -4}), equalTo(1L));
    }
}
