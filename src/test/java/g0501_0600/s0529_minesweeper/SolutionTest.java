package g0501_0600.s0529_minesweeper;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void updateBoard() {
        char[][] input =
                new char[][] {
                    {'E', 'E', 'E', 'E', 'E'},
                    {'E', 'E', 'M', 'E', 'E'},
                    {'E', 'E', 'E', 'E', 'E'},
                    {'E', 'E', 'E', 'E', 'E'}
                };
        char[][] expected =
                new char[][] {
                    {'B', '1', 'E', '1', 'B'},
                    {'B', '1', 'M', '1', 'B'},
                    {'B', '1', '1', '1', 'B'},
                    {'B', 'B', 'B', 'B', 'B'}
                };
        assertThat(new Solution().updateBoard(input, new int[] {3, 0}), equalTo(expected));
    }

    @Test
    void updateBoard2() {
        char[][] input =
                new char[][] {
                    {'B', '1', 'E', '1', 'B'},
                    {'B', '1', 'M', '1', 'B'},
                    {'B', '1', '1', '1', 'B'},
                    {'B', 'B', 'B', 'B', 'B'}
                };
        char[][] expected =
                new char[][] {
                    {'B', '1', 'E', '1', 'B'},
                    {'B', '1', 'X', '1', 'B'},
                    {'B', '1', '1', '1', 'B'},
                    {'B', 'B', 'B', 'B', 'B'}
                };
        assertThat(new Solution().updateBoard(input, new int[] {1, 2}), equalTo(expected));
    }
}
