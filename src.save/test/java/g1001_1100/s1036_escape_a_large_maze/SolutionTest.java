package g1001_1100.s1036_escape_a_large_maze;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isEscapePossible() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {{0, 1}, {1, 0}}, new int[] {0, 0}, new int[] {0, 2}),
                equalTo(false));
    }

    @Test
    void isEscapePossible2() {
        assertThat(
                new Solution()
                        .isEscapePossible(
                                new int[][] {}, new int[] {0, 0}, new int[] {999999, 999999}),
                equalTo(true));
    }
}
