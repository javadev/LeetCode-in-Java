package g1501_1600.s1590_make_sum_divisible_by_p;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSubarray() {
        assertThat(new Solution().minSubarray(new int[] {3, 1, 4, 2}, 6), equalTo(1));
    }

    @Test
    void minSubarray2() {
        assertThat(new Solution().minSubarray(new int[] {6, 3, 5, 2}, 9), equalTo(2));
    }

    @Test
    void minSubarray3() {
        assertThat(new Solution().minSubarray(new int[] {1, 2, 3}, 3), equalTo(0));
    }
}
