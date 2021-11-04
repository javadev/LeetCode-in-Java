package g0001_0100.s0016_three_sum_closest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void threeSumClosest() {
        Solution solution = new Solution();
        assertThat(solution.threeSumClosest(new int[] {-1, 2, 1, -4}, 1), equalTo(2));
        assertThat(solution.threeSumClosest(new int[] {0, 0, 0}, 1), equalTo(0));
    }
}
