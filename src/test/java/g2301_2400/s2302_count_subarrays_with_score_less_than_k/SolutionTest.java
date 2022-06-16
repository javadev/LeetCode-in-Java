package g2301_2400.s2302_count_subarrays_with_score_less_than_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubarrays() {
        assertThat(new Solution().countSubarrays(new int[] {2, 1, 4, 3, 5}, 10), equalTo(6L));
    }

    @Test
    void countSubarrays2() {
        assertThat(new Solution().countSubarrays(new int[] {1, 1, 1}, 5), equalTo(5L));
    }
}
