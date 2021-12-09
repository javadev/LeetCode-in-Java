package g0901_1000.s0994_rotting_oranges;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void orangesRotting() {
        assertThat(
                new Solution().orangesRotting(new int[][] {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}}),
                equalTo(4));
    }

    @Test
    void orangesRotting2() {
        assertThat(new Solution().orangesRotting(new int[][] {{0, 2}}), equalTo(0));
    }
}
