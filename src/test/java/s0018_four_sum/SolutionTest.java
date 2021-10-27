package s0018_four_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void fourSum() {
        assertThat(
                new Solution().fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0).toString(),
                equalTo("[[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]"));
    }
}
