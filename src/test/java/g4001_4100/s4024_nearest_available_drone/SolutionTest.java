package g4001_4100.s4024_nearest_available_drone;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nearestDrone() {
        assertThat(
                new Solution().nearestDrone(new int[][] {{1, 2, 3}, {2, 2, 2}}, new int[] {0, 0}),
                equalTo(0));
    }

    @Test
    void nearestDrone2() {
        assertThat(
                new Solution().nearestDrone(new int[][] {{1, 0, 1}, {-1, 0, 1}}, new int[] {0, 0}),
                equalTo(0));
    }

    @Test
    void nearestDrone3() {
        assertThat(
                new Solution().nearestDrone(new int[][] {{3, 0, 2}, {0, 4, 3}}, new int[] {0, 0}),
                equalTo(-1));
    }
}
