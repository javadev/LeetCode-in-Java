package g3601_3700.s3661_maximum_walls_destroyed_by_robots;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxWalls() {
        assertThat(
                new Solution().maxWalls(new int[] {4}, new int[] {3}, new int[] {1, 10}),
                equalTo(1));
    }

    @Test
    void maxWalls2() {
        assertThat(
                new Solution().maxWalls(new int[] {10, 2}, new int[] {5, 1}, new int[] {5, 2, 7}),
                equalTo(3));
    }

    @Test
    void maxWalls3() {
        assertThat(
                new Solution().maxWalls(new int[] {1, 2}, new int[] {100, 1}, new int[] {10}),
                equalTo(0));
    }
}
