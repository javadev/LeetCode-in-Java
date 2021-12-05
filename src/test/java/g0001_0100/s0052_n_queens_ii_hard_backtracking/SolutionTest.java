package g0001_0100.s0052_n_queens_ii_hard_backtracking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void totalNQueens() {
        assertThat(new Solution().totalNQueens(4), equalTo(2));
    }
}
