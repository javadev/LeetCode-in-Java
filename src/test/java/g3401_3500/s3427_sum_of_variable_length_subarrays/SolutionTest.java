package g3401_3500.s3427_sum_of_variable_length_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subarraySum() {
        assertThat(new Solution().subarraySum(new int[] {2, 3, 1}), equalTo(11));
    }

    @Test
    void subarraySum2() {
        assertThat(new Solution().subarraySum(new int[] {3, 1, 1, 2}), equalTo(13));
    }
}
