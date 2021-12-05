package g0101_0200.s0154_find_minimum_in_rotated_sorted_array_ii_hard_array_binary_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void findMin() {
        assertThat(new Solution().findMin(new int[] {1, 3, 5}), equalTo(1));
        assertThat(new Solution().findMin(new int[] {2, 2, 2, 0, 1}), equalTo(0));
    }
}
