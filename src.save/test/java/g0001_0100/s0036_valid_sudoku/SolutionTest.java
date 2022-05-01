package g0001_0100.s0036_valid_sudoku;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isValidSudoku() {
        boolean result =
                new Solution()
                        .isValidSudoku(
                                new char[][] {
                                    {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                                    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                                    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                                    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                                    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                                    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                                    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                                    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                                    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                                });
        assertThat(result, equalTo(true));
    }

    @Test
    void isValidSudoku2() {
        boolean result =
                new Solution()
                        .isValidSudoku(
                                new char[][] {
                                    {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                                    {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                                    {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                                    {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                                    {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                                    {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                                    {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                                    {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                                    {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                                });
        assertThat(result, equalTo(false));
    }
}
