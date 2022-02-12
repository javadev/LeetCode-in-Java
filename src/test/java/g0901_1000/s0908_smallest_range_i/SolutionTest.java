package g0901_1000.s0908_smallest_range_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestRangeI() {
        assertThat(new Solution().smallestRangeI(new int[] {1}, 0), equalTo(0));
    }

    @Test
    void smallestRangeI2() {
        assertThat(new Solution().smallestRangeI(new int[] {0, 10}, 2), equalTo(6));
    }

    @Test
    void smallestRangeI3() {
        assertThat(new Solution().smallestRangeI(new int[] {1, 3, 6}, 3), equalTo(0));
    }
}
