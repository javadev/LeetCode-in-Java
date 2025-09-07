package g3601_3700.s3676_count_bowl_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bowlSubarrays() {
        assertThat(new Solution().bowlSubarrays(new int[] {2, 5, 3, 1, 4}), equalTo(2L));
    }

    @Test
    void bowlSubarrays2() {
        assertThat(new Solution().bowlSubarrays(new int[] {5, 1, 2, 3, 4}), equalTo(3L));
    }

    @Test
    void bowlSubarrays3() {
        assertThat(
                new Solution().bowlSubarrays(new int[] {1000000000, 999999999, 999999998}),
                equalTo(0L));
    }
}
