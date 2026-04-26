package g3701_3800.s3737_count_subarrays_with_majority_element_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countMajoritySubarrays() {
        assertThat(new Solution().countMajoritySubarrays(new int[] {1, 1, 2}, 1), equalTo(4));
    }

    @Test
    void countMajoritySubarrays2() {
        assertThat(new Solution().countMajoritySubarrays(new int[] {2, 2}, 1), equalTo(0));
    }

    @Test
    void countMajoritySubarrays3() {
        assertThat(new Solution().countMajoritySubarrays(new int[] {1, 2, 1, 2}, 1), equalTo(3));
    }
}
