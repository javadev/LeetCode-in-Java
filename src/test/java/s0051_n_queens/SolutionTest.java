package s0051_n_queens;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void nQueens() {
        List<List<String>> actual = new Solution().solveNQueens(4);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList(".Q..", "...Q", "Q...", "..Q."));
        expected.add(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."));

        for (int i = 0; i < expected.size(); i++) {
            for (int j = 0; j < expected.get(i).size(); j++) {
                assertThat(actual.get(i).get(j), equalTo(expected.get(i).get(j)));
            }
        }
    }
}
