package g3701_3800.s3704_count_no_zero_pairs_that_sum_to_n;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countNoZeroPairs() {
        assertThat(new Solution().countNoZeroPairs(2L), equalTo(1L));
    }

    @Test
    void countNoZeroPairs2() {
        assertThat(new Solution().countNoZeroPairs(3L), equalTo(2L));
    }

    @Test
    void countNoZeroPairs3() {
        assertThat(new Solution().countNoZeroPairs(11L), equalTo(8L));
    }
}
