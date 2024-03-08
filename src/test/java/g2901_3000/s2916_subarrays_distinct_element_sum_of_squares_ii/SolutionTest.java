package g2901_3000.s2916_subarrays_distinct_element_sum_of_squares_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumCounts() {
        assertThat(new Solution().sumCounts(new int[] {1, 2, 1}), equalTo(15));
    }

    @Test
    void sumCounts2() {
        assertThat(new Solution().sumCounts(new int[] {2, 2}), equalTo(3));
    }
}
