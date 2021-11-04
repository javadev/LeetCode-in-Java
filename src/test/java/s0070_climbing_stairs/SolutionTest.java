package s0070_climbing_stairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void climbStairs() {
        assertThat(new Solution().climbStairs(2), equalTo(2));
    }
}
