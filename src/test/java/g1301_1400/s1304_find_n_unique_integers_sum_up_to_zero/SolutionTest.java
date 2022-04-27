package g1301_1400.s1304_find_n_unique_integers_sum_up_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sumZero() {
        assertThat(new Solution().sumZero(5), equalTo(new int[] {-2, -1, 0, 1, 2}));
    }

    @Test
    void sumZero2() {
        assertThat(new Solution().sumZero(3), equalTo(new int[] {-1, 0, 1}));
    }

    @Test
    void sumZero3() {
        assertThat(new Solution().sumZero(1), equalTo(new int[] {0}));
    }
}
