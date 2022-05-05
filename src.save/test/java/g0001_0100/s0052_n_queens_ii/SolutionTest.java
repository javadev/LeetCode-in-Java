package g0001_0100.s0052_n_queens_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalNQueens() {
        assertThat(new Solution().totalNQueens(4), equalTo(2));
    }

    @Test
    void totalNQueens2() {
        assertThat(new Solution().totalNQueens(1), equalTo(1));
    }
}
