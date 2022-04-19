package g0001_0100.s0015_3sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void threeSum() {
        assertThat(
                new Solution().threeSum(new int[] {-1, 0, 1, 2, -1, -4}),
                equalTo(ArrayUtils.getLists(new int[][] {{-1, -1, 2}, {-1, 0, 1}})));
    }

    @Test
    void threeSum2() {
        assertThat(
                new Solution().threeSum(new int[] {}),
                equalTo(ArrayUtils.getLists(new int[][] {})));
    }

    @Test
    void threeSum3() {
        assertThat(
                new Solution().threeSum(new int[] {0}),
                equalTo(ArrayUtils.getLists(new int[][] {})));
    }
}
