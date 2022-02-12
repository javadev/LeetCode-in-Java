package g0901_1000.s0910_smallest_range_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestRangeII() {
        assertThat(new Solution().smallestRangeII(new int[] {1}, 0), equalTo(0));
    }

    @Test
    void smallestRangeII2() {
        assertThat(new Solution().smallestRangeII(new int[] {0, 10}, 2), equalTo(6));
    }

    @Test
    void smallestRangeII3() {
        assertThat(new Solution().smallestRangeII(new int[] {1, 3, 6}, 3), equalTo(3));
    }
}
