package g0301_0400.s0377_combination_sum_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void combinationSum4() {
        assertThat(new Solution().combinationSum4(new int[] {1, 2, 3}, 4), equalTo(7));
    }

    @Test
    void combinationSum42() {
        assertThat(new Solution().combinationSum4(new int[] {9}, 3), equalTo(0));
    }
}
