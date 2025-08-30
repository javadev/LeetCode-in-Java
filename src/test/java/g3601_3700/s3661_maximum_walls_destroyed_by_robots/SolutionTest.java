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

    @Test
    void maxWalls4() {
        int[] robots = {5};
        int[] distance = {3};
        int[] walls = {};
        assertThat(new Solution().maxWalls(robots, distance, walls), equalTo(0));
    }

    @Test
    void maxWalls5() {
        int[] robots = {5};
        int[] distance = {3};
        int[] walls = {2, 4, 5, 6, 8};
        assertThat(new Solution().maxWalls(robots, distance, walls), equalTo(3));
    }

    @Test
    void maxWalls6() {
        int[] robots = {10};
        int[] distance = {2};
        int[] walls = {7, 8, 9, 10, 11, 13};
        assertThat(new Solution().maxWalls(robots, distance, walls), equalTo(3));
    }

    @Test
    void maxWalls7() {
        int[] robots = {5, 15};
        int[] distance = {2, 2};
        int[] walls = {4, 5, 6, 14, 15, 16};
        assertThat(new Solution().maxWalls(robots, distance, walls), equalTo(4));
    }

    @Test
    void maxWalls8() {
        int[] robots = {5, 8};
        int[] distance = {5, 5};
        int[] walls = {2, 4, 5, 6, 7, 8, 9, 10};
        assertThat(new Solution().maxWalls(robots, distance, walls), equalTo(6));
    }

    @Test
    void maxWalls9() {
        int[] robots = {3, 10, 20};
        int[] distance = {2, 3, 4};
        int[] walls = {1, 2, 3, 4, 5, 8, 10, 12, 17, 19, 20, 22};
        assertThat(new Solution().maxWalls(robots, distance, walls), equalTo(8));
    }
}
