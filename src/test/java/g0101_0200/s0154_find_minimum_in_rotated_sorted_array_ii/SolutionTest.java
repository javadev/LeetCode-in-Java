package g0101_0200.s0154_find_minimum_in_rotated_sorted_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMin() {
        assertThat(new Solution().findMin(new int[] {1, 3, 5}), equalTo(1));
    }

    @Test
    void findMin2() {
        assertThat(new Solution().findMin(new int[] {2, 2, 2, 0, 1}), equalTo(0));
    }
}
