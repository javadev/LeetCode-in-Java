package g2501_2600.s2588_count_the_number_of_beautiful_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautifulSubarrays() {
        assertThat(new Solution().beautifulSubarrays(new int[] {4, 3, 1, 2, 4}), equalTo(2L));
    }

    @Test
    void beautifulSubarrays2() {
        assertThat(new Solution().beautifulSubarrays(new int[] {1, 10, 4}), equalTo(0L));
    }
}
