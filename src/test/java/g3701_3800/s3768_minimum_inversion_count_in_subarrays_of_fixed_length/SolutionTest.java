package g3701_3800.s3768_minimum_inversion_count_in_subarrays_of_fixed_length;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minInversionCount() {
        assertThat(new Solution().minInversionCount(new int[] {3, 1, 2}, 2), equalTo(0L));
    }

    @Test
    void minInversionCount2() {
        assertThat(new Solution().minInversionCount(new int[] {3, 2, 1}, 3), equalTo(3L));
    }

    @Test
    void minInversionCount3() {
        assertThat(new Solution().minInversionCount(new int[] {1, 2, 3, 4}, 2), equalTo(0L));
    }
}
