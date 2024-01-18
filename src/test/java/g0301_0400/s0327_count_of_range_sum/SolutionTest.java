package g0301_0400.s0327_count_of_range_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countRangeSum() {
        assertThat(new Solution().countRangeSum(new int[] {-2, 5, -1}, -2, 2), equalTo(3));
    }

    @Test
    void countRangeSum2() {
        assertThat(new Solution().countRangeSum(new int[] {0}, 0, 0), equalTo(1));
    }
}
