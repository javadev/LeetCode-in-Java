package g3701_3800.s3739_count_subarrays_with_majority_element_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countMajoritySubarrays() {
        assertThat(new Solution().countMajoritySubarrays(new int[] {1, 1, 2}, 1), equalTo(4L));
    }

    @Test
    void countMajoritySubarrays2() {
        assertThat(new Solution().countMajoritySubarrays(new int[] {2, 2}, 1), equalTo(0L));
    }

    @Test
    void countMajoritySubarrays3() {
        assertThat(new Solution().countMajoritySubarrays(new int[] {1, 2, 1, 2}, 1), equalTo(3L));
    }
}
