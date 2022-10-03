package g0401_0500.s0494_target_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTargetSumWays() {
        assertThat(new Solution().findTargetSumWays(new int[] {1, 1, 1, 1, 1}, 3), equalTo(5));
    }

    @Test
    void findTargetSumWays2() {
        assertThat(new Solution().findTargetSumWays(new int[] {1}, 1), equalTo(1));
    }
}
