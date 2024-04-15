package g2701_2800.s2799_count_complete_subarrays_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCompleteSubarrays() {
        int[] nums1 = {1, 3, 1, 2, 2};
        assertThat(new Solution().countCompleteSubarrays(nums1), equalTo(4));
    }

    @Test
    void countCompleteSubarrays2() {
        int[] nums2 = {5, 5, 5, 5};
        assertThat(new Solution().countCompleteSubarrays(nums2), equalTo(10));
    }
}
