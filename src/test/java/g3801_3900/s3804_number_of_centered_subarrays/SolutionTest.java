package g3801_3900.s3804_number_of_centered_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void centeredSubarrays() {
        assertThat(new Solution().centeredSubarrays(new int[] {-1, 1, 0}), equalTo(5));
    }

    @Test
    void centeredSubarrays2() {
        assertThat(new Solution().centeredSubarrays(new int[] {2, -3}), equalTo(2));
    }
}
