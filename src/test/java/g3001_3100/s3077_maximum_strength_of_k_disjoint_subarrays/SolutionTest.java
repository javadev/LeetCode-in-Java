package g3001_3100.s3077_maximum_strength_of_k_disjoint_subarrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumStrength() {
        assertThat(new Solution().maximumStrength(new int[] {1, 2, 3, -1, 2}, 3), equalTo(22L));
    }

    @Test
    void maximumStrength2() {
        assertThat(new Solution().maximumStrength(new int[] {12, -2, -2, -2, -2}, 5), equalTo(64L));
    }

    @Test
    void maximumStrength3() {
        assertThat(new Solution().maximumStrength(new int[] {-1, -2, -3}, 1), equalTo(-1L));
    }
}
