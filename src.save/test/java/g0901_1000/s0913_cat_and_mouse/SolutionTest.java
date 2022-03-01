package g0901_1000.s0913_cat_and_mouse;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void catMouseGame() {
        assertThat(
                new Solution()
                        .catMouseGame(
                                new int[][] {{2, 5}, {3}, {0, 4, 5}, {1, 4, 5}, {2, 3}, {0, 2, 3}}),
                equalTo(0));
    }

    @Test
    void catMouseGame2() {
        assertThat(new Solution().catMouseGame(new int[][] {{1, 3}, {0}, {3}, {0, 2}}), equalTo(1));
    }
}
