package g4001_4100.s4013_count_subarrays_with_even_odd_ratio_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countRatioSubarrays() {
        assertThat(new Solution().countRatioSubarrays(new int[] {1, 2, 1, 2}, 3, 2), equalTo(7L));
    }

    @Test
    void countRatioSubarrays2() {
        assertThat(new Solution().countRatioSubarrays(new int[] {2, 2, 1}, 2, 1), equalTo(3L));
    }

    @Test
    void countRatioSubarrays3() {
        assertThat(new Solution().countRatioSubarrays(new int[] {2, 2, 2}, 1, 1), equalTo(0L));
    }
}
