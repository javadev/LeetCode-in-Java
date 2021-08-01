package s0016.three.sum.closest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void threeSum() {
        assertThat(new Solution().threeSumClosest(new int[] {-1, 2, 1, -4}, 1), equalTo(2));
    }
}
