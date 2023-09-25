package g1901_2000.s1926_nearest_exit_from_entrance_in_maze;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nearestExit() {
        assertThat(
                new Solution()
                        .nearestExit(
                                new char[][] {
                                    {'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}
                                },
                                new int[] {1, 2}),
                equalTo(1));
    }

    @Test
    void nearestExit2() {
        assertThat(
                new Solution()
                        .nearestExit(
                                new char[][] {{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}},
                                new int[] {1, 0}),
                equalTo(2));
    }

    @Test
    void nearestExit3() {
        assertThat(
                new Solution().nearestExit(new char[][] {{'.', '+'}}, new int[] {0, 0}),
                equalTo(-1));
    }
}
