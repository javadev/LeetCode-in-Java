package g3201_3300.s3209_number_of_subarrays_with_and_value_of_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubarrays() {
        assertThat(new Solution().countSubarrays(new int[] {1, 1, 2}, 1), equalTo(3L));
    }

    @Test
    void countSubarrays2() {
        assertThat(new Solution().countSubarrays(new int[] {1, 2, 3}, 2), equalTo(2L));
    }
}
