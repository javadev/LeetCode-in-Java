package g2701_2800.s2742_painting_the_walls;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void paintWalls() {
        assertThat(
                new Solution().paintWalls(new int[] {1, 2, 3, 2}, new int[] {1, 2, 3, 2}),
                equalTo(3));
    }

    @Test
    void paintWalls2() {
        assertThat(
                new Solution().paintWalls(new int[] {2, 3, 4, 2}, new int[] {1, 1, 1, 1}),
                equalTo(4));
    }
}
