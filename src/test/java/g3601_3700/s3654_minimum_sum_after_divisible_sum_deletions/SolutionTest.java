package g3601_3700.s3654_minimum_sum_after_divisible_sum_deletions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minArraySum() {
        assertThat(new Solution().minArraySum(new int[] {1, 1, 1}, 2), equalTo(1L));
    }

    @Test
    void minArraySum2() {
        assertThat(new Solution().minArraySum(new int[] {3, 1, 4, 1, 5}, 3), equalTo(5L));
    }
}
