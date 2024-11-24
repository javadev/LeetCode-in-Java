package g3301_3400.s3366_minimum_array_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minArraySum() {
        assertThat(new Solution().minArraySum(new int[] {2, 8, 3, 19, 3}, 3, 1, 1), equalTo(23));
    }

    @Test
    void minArraySum2() {
        assertThat(new Solution().minArraySum(new int[] {2, 4, 3}, 3, 2, 1), equalTo(3));
    }
}
