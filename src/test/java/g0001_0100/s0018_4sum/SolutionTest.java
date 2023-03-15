package g0001_0100.s0018_4sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void fourSum() {
        assertThat(
                new Solution().fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0),
                equalTo(
                        ArrayUtils.getLists(
                                new int[][] {{-2, -1, 1, 2}, {-2, 0, 0, 2}, {-1, 0, 0, 1}})));
    }

    @Test
    void fourSum2() {
        assertThat(
                new Solution().fourSum(new int[] {2, 2, 2, 2, 2}, 8),
                equalTo(ArrayUtils.getLists(new int[][] {{2, 2, 2, 2}})));
    }

    @Test
    void fourSum3() {
        assertThat(new Solution().fourSum(new int[] {2, 2, 2}, 8), equalTo(Arrays.asList()));
    }

    @Test
    void fourSum4() {
        assertThat(
                new Solution().fourSum(new int[] {1000000000, 1000000000}, 8),
                equalTo(Arrays.asList()));
    }
}
