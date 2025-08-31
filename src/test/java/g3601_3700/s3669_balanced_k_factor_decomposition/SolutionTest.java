package g3601_3700.s3669_balanced_k_factor_decomposition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDifference() {
        assertThat(new Solution().minDifference(100, 2), equalTo(new int[] {10, 10}));
    }

    @Test
    void minDifference2() {
        assertThat(new Solution().minDifference(44, 3), equalTo(new int[] {2, 2, 11}));
    }
}
