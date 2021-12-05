package g0101_0200.s0153_find_minimum_in_rotated_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMin() {
        assertThat(new Solution().findMin(new int[] {3, 4, 5, 1, 2}), equalTo(1));
    }
}
