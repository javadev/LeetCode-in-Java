package g1201_1300.s1293_shortest_path_in_a_grid_with_obstacles_elimination;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shortestPath() {
        assertThat(
                new Solution()
                        .shortestPath(
                                new int[][] {{0, 0, 0}, {1, 1, 0}, {0, 0, 0}, {0, 1, 1}, {0, 0, 0}},
                                1),
                equalTo(6));
    }

    @Test
    void shortestPath2() {
        assertThat(
                new Solution().shortestPath(new int[][] {{0, 1, 1}, {1, 1, 1}, {1, 0, 0}}, 1),
                equalTo(-1));
    }
}
