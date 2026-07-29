package g3801_3900.s3859_count_subarrays_with_k_distinct_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubarrays() {
        assertThat(new Solution().countSubarrays(new int[] {1, 2, 1, 2, 2}, 2, 2), equalTo(2L));
    }

    @Test
    void countSubarrays2() {
        assertThat(new Solution().countSubarrays(new int[] {3, 1, 2, 4}, 2, 1), equalTo(3L));
    }

    @Test
    void countSubarrays3() {
        assertThat(new Solution().countSubarrays(new int[] {1, 1, 1}, 1, 2), equalTo(3L));
    }
}
