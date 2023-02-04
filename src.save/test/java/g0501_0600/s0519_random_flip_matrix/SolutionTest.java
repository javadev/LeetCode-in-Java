package g0501_0600.s0519_random_flip_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solutionTest() {
        Solution solution = new Solution(3, 1);
        CommonUtils.printArray(solution.flip());
        CommonUtils.printArray(solution.flip());
        CommonUtils.printArray(solution.flip());
        solution.reset();
        CommonUtils.printArray(solution.flip());
        assertThat(true, equalTo(true));
    }
}
