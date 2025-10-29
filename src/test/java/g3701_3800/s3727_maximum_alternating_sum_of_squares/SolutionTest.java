package g3701_3800.s3727_maximum_alternating_sum_of_squares;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAlternatingSum() {
        assertThat(new Solution().maxAlternatingSum(new int[] {1, 2, 3}), equalTo(12L));
    }

    @Test
    void maxAlternatingSum2() {
        assertThat(new Solution().maxAlternatingSum(new int[] {1, -1, 2, -2, 3, -3}), equalTo(16L));
    }
}
