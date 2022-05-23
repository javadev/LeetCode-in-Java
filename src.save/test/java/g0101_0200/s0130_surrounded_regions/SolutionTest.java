package g0101_0200.s0130_surrounded_regions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solve() {
        char[][] board =
                new char[][] {
                    {'X', 'X', 'X', 'X'},
                    {'X', 'O', 'O', 'X'},
                    {'X', 'X', 'O', 'X'},
                    {'X', 'O', 'X', 'X'}
                };
        new Solution().solve(board);
        assertThat(
                board,
                equalTo(
                        new char[][] {
                            {'X', 'X', 'X', 'X'},
                            {'X', 'X', 'X', 'X'},
                            {'X', 'X', 'X', 'X'},
                            {'X', 'O', 'X', 'X'}
                        }));
    }

    @Test
    void solve2() {
        char[][] board = new char[][] {{'X'}};
        new Solution().solve(board);
        assertThat(board, equalTo(new char[][] {{'X'}}));
    }
}
