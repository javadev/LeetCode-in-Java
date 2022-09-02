package g1801_1900.s1847_closest_room;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closestRoom() {
        assertThat(
                new Solution()
                        .closestRoom(
                                new int[][] {{2, 2}, {1, 2}, {3, 2}},
                                new int[][] {{3, 1}, {3, 3}, {5, 2}}),
                equalTo(new int[] {3, -1, 3}));
    }

    @Test
    void closestRoom2() {
        assertThat(
                new Solution()
                        .closestRoom(
                                new int[][] {{1, 4}, {2, 3}, {3, 5}, {4, 1}, {5, 2}},
                                new int[][] {{2, 3}, {2, 4}, {2, 5}}),
                equalTo(new int[] {2, 1, 3}));
    }
}
