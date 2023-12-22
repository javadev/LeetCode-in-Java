package g2801_2900.s2875_minimum_size_subarray_in_infinite_array;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void minSizeSubarray() {
        assertThat(new Solution().minSizeSubarray(new int[]{1,2,3}, 5), equalTo(2));
    }

    @Test
    void minSizeSubarray2() {
        assertThat(new Solution().minSizeSubarray(new int[]{1,1,1,2,3}, 4), equalTo(2));
    }

    @Test
    void minSizeSubarray3() {
        assertThat(new Solution().minSizeSubarray(new int[]{2,4,6,8}, 3), equalTo(-1));
    }
}
