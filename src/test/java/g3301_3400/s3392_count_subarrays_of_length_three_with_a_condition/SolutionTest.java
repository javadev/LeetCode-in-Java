package g3301_3400.s3392_count_subarrays_of_length_three_with_a_condition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubarrays() {
        assertThat(new Solution().countSubarrays(new int[] {1, 2, 1, 4, 1}), equalTo(1));
    }

    @Test
    void countSubarrays2() {
        assertThat(new Solution().countSubarrays(new int[] {1, 1, 1}), equalTo(0));
    }
}
