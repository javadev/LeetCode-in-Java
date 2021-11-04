package g0001_0100.s0015_three_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void threeSum() {
        assertThat(
                new Solution().threeSum(new int[] {-1, 0, 1, 2, -1, -4}).toString(),
                equalTo("[[-1, -1, 2], [-1, 0, 1]]"));
    }
}
