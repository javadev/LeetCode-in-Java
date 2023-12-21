package g0901_1000.s0992_subarrays_with_k_different_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subarraysWithKDistinct() {
        assertThat(new Solution().subarraysWithKDistinct(new int[] {1, 2, 1, 2, 3}, 2), equalTo(7));
    }

    @Test
    void subarraysWithKDistinct2() {
        assertThat(new Solution().subarraysWithKDistinct(new int[] {1, 2, 1, 3, 4}, 3), equalTo(3));
    }
}
