package g2401_2500.s2488_count_subarrays_with_median_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubarrays() {
        assertThat(new Solution().countSubarrays(new int[] {3, 2, 1, 4, 5}, 4), equalTo(3));
    }

    @Test
    void countSubarrays2() {
        assertThat(new Solution().countSubarrays(new int[] {2, 3, 1}, 3), equalTo(1));
    }
}
