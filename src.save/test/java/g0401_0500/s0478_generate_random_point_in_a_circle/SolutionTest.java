package g0401_0500.s0478_generate_random_point_in_a_circle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void randPoint() {
        Solution solution = new Solution(1.0, 0.0, 0.0);
        CommonUtils.printArray(solution.randPoint());
        CommonUtils.printArray(solution.randPoint());
        CommonUtils.printArray(solution.randPoint());
        assertThat(solution, equalTo(solution));
    }
}
