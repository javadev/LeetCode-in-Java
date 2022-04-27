package g0801_0900.s0874_walking_robot_simulation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void robotSim() {
        assertThat(new Solution().robotSim(new int[] {4, -1, 3}, new int[][] {}), equalTo(25));
    }

    @Test
    void robotSim2() {
        assertThat(
                new Solution().robotSim(new int[] {4, -1, 4, -2, 4}, new int[][] {{2, 4}}),
                equalTo(65));
    }

    @Test
    void robotSim3() {
        assertThat(
                new Solution()
                        .robotSim(
                                new int[] {
                                    4, -1, 4, -2, 4, 3, 5, -1, 3, -2, 4, -1, 3, -1, 2, -1, 4, -1, 5,
                                    -1, 3, -1, 2
                                },
                                new int[][] {{2, 4}, {4, 5}, {2, 3}, {0, 1}, {1, 6}}),
                equalTo(202));
    }
}
