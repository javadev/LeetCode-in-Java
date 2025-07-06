package g3601_3700.s3605_minimum_stability_factor_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minStable() {
        assertThat(new Solution().minStable(new int[] {3, 5, 10}, 1), equalTo(1));
    }

    @Test
    void minStable2() {
        assertThat(new Solution().minStable(new int[] {2, 6, 8}, 2), equalTo(1));
    }

    @Test
    void minStable3() {
        assertThat(new Solution().minStable(new int[] {2, 4, 9, 6}, 1), equalTo(2));
    }
}
