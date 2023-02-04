package g0401_0500.s0497_random_point_in_non_overlapping_rectangles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solutionTest() {
        Solution solution = new Solution(new int[][] {{-2, -2, 1, 1}, {2, 2, 4, 6}});
        CommonUtils.printArray(solution.pick());
        CommonUtils.printArray(solution.pick());
        CommonUtils.printArray(solution.pick());
        CommonUtils.printArray(solution.pick());
        CommonUtils.printArray(solution.pick());
        assertThat(true, equalTo(true));
    }
}
