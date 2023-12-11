package g1001_1100.s1033_moving_stones_until_consecutive;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numMovesStones() {
        assertThat(new Solution().numMovesStones(1, 2, 5), equalTo(new int[] {1, 2}));
    }

    @Test
    void numMovesStones2() {
        assertThat(new Solution().numMovesStones(4, 3, 2), equalTo(new int[] {0, 0}));
    }

    @Test
    void numMovesStones3() {
        assertThat(new Solution().numMovesStones(3, 5, 1), equalTo(new int[] {1, 2}));
    }
}
