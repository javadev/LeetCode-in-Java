package g0001_0100.s0016_three_sum_closest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void threeSumClosest() {
        assertThat(new Solution().threeSumClosest(new int[] {-1, 2, 1, -4}, 1), equalTo(2));
    }
}
