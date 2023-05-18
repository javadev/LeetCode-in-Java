package g2401_2500.s2461_maximum_sum_of_distinct_subarrays_with_length_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSubarraySum() {
        assertThat(
                new Solution().maximumSubarraySum(new int[] {1, 5, 4, 2, 9, 9, 9}, 3),
                equalTo(15L));
    }

    @Test
    void maximumSubarraySum2() {
        assertThat(new Solution().maximumSubarraySum(new int[] {4, 4, 4}, 3), equalTo(0L));
    }
}
