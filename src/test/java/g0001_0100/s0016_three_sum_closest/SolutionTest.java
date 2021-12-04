package g0001_0100.s0016_three_sum_closest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void threeSumClosest() {
        assertThat(new Solution().threeSumClosest(new int[] {-1, 2, 1, -4}, 1), equalTo(2));
    }

    @Test
    public void threeSumClosest2() {
        assertThat(new Solution().threeSumClosest(new int[] {0, 0, 0}, 1), equalTo(0));
    }

    @Test
    public void threeSumClosest3() {
        assertThat(
                new Solution().threeSumClosest(new int[] {1, 2, 4, 8, 16, 32, 64, 128}, 82),
                equalTo(82));
    }

    @Test
    public void threeSumClosest4() {
        assertThat(
                new Solution().threeSumClosest(new int[] {4, 0, 5, -5, 3, 3, 0, -4, -5}, -2),
                equalTo(-2));
    }
}
