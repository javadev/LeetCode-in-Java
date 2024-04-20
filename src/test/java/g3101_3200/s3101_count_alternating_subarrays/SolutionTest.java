package g3101_3200.s3101_count_alternating_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countAlternatingSubarrays() {
        assertThat(new Solution().countAlternatingSubarrays(new int[] {0, 1, 1, 1}), equalTo(5L));
    }

    @Test
    void countAlternatingSubarrays2() {
        assertThat(new Solution().countAlternatingSubarrays(new int[] {1, 0, 1, 0}), equalTo(10L));
    }
}
