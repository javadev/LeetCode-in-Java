package g0001_0100.s0070_climbing_stairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void climbStairs() {
        assertThat(new Solution().climbStairs(2), equalTo(2));
    }

    @Test
    void climbStairs2() {
        assertThat(new Solution().climbStairs(3), equalTo(3));
    }
}
