package g3801_3900.s3873_maximum_points_activated_with_one_addition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void connectsTheTwoLargestActivationComponents() {
        Solution solution = new Solution();

        assertThat(solution.maxActivated(new int[][] {{1, 1}, {1, 2}, {2, 2}}), equalTo(4));
        assertThat(solution.maxActivated(new int[][] {{2, 2}, {1, 1}, {3, 3}}), equalTo(3));
        assertThat(solution.maxActivated(new int[][] {{2, 3}, {2, 2}, {1, 1}, {4, 5}}), equalTo(4));
    }
}
