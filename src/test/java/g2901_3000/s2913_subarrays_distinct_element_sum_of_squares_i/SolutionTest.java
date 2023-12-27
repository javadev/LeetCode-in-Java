package g2901_3000.s2913_subarrays_distinct_element_sum_of_squares_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumCounts() {
        assertThat(new Solution().sumCounts(Arrays.asList(1, 2, 1)), equalTo(15));
    }

    @Test
    void sumCounts2() {
        assertThat(new Solution().sumCounts(Arrays.asList(1, 1)), equalTo(3));
    }
}
