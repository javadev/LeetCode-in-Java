package g2901_3000.s2962_count_subarrays_where_max_element_appears_at_least_k_times;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void countSubarrays() {
        assertThat(new Solution().countSubarrays(new int[]{1,3,2,3,3}, 2), equalTo(3));
    }

    @Test
    void countSubarrays2() {
        assertThat(new Solution().countSubarrays(new int[]{1,4,2,1}, 3), equalTo(0));
    }
}
