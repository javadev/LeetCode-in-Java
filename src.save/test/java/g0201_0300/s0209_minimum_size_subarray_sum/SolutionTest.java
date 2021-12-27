package g0201_0300.s0209_minimum_size_subarray_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSubArrayLen() {
        assertThat(new Solution().minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}), equalTo(2));
    }

    @Test
    void minSubArrayLen2() {
        assertThat(new Solution().minSubArrayLen(4, new int[] {1, 4, 4}), equalTo(1));
    }

    @Test
    void minSubArrayLen3() {
        assertThat(
                new Solution().minSubArrayLen(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1}), equalTo(0));
    }
}
