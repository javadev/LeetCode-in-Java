package g0001_0100.s0051_n_queens;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solveNQueens() {
        assertThat(
                new Solution().solveNQueens(4),
                equalTo(
                        ArrayUtils.getLists(
                                new String[][] {
                                    {".Q..", "...Q", "Q...", "..Q."},
                                    {"..Q.", "Q...", "...Q", ".Q.."}
                                })));
    }

    @Test
    void solveNQueens2() {
        assertThat(
                new Solution().solveNQueens(1),
                equalTo(ArrayUtils.getLists(new String[][] {{"Q"}})));
    }
}
