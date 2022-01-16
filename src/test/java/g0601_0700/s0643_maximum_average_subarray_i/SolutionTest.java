package g0601_0700.s0643_maximum_average_subarray_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxAverage() {
        assertThat(
                new Solution().findMaxAverage(new int[] {1, 12, -5, -6, 50, 3}, 4),
                equalTo(12.75000));
    }

    @Test
    void findMaxAverage2() {
        assertThat(new Solution().findMaxAverage(new int[] {5}, 1), equalTo(5.00000));
    }
}
