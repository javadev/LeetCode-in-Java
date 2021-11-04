package s0052_n_queens_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void nQueensII() {
        assertThat(new Solution().totalNQueens(4), equalTo(2));
    }
}
