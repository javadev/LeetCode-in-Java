package g2901_3000.s2970_count_the_number_of_incremovable_subarrays_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void incremovableSubarrayCount() {
        assertThat(new Solution().incremovableSubarrayCount(new int[] {1, 2, 3, 4}), equalTo(10));
    }

    @Test
    void incremovableSubarrayCount2() {
        assertThat(new Solution().incremovableSubarrayCount(new int[] {6, 5, 7, 8}), equalTo(7));
    }

    @Test
    void incremovableSubarrayCount3() {
        assertThat(new Solution().incremovableSubarrayCount(new int[] {8, 7, 6, 6}), equalTo(3));
    }
}
