package g0901_1000.s0947_most_stones_removed_with_same_row_or_column;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeStones() {
        assertThat(
                new Solution()
                        .removeStones(new int[][] {{0, 0}, {0, 1}, {1, 0}, {1, 2}, {2, 1}, {2, 2}}),
                equalTo(5));
    }

    @Test
    void removeStones2() {
        assertThat(
                new Solution().removeStones(new int[][] {{0, 0}, {0, 2}, {1, 1}, {2, 0}, {2, 2}}),
                equalTo(3));
    }

    @Test
    void removeStones3() {
        assertThat(new Solution().removeStones(new int[][] {{0, 0}}), equalTo(0));
    }
}
