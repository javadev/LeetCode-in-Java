package g3601_3700.s3689_maximum_total_subarray_value_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTotalValue() {
        assertThat(new Solution().maxTotalValue(new int[] {1, 3, 2}, 2), equalTo(4L));
    }

    @Test
    void maxTotalValue2() {
        assertThat(new Solution().maxTotalValue(new int[] {4, 2, 5, 1}, 3), equalTo(12L));
    }
}
