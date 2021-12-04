package g0001_0100.s0051_n_queens;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void solveNQueens() {
        List<List<String>> actual = new Solution().solveNQueens(4);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));

        assertThat(actual, equalTo(expected));
    }
}
