package g0101_0200.s0118_pascals_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void generate() {
        List<List<Integer>> expected =
                ArrayUtils.getLists(
                        new int[][] {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}});
        assertThat(new Solution().generate(5), equalTo(expected));
    }

    @Test
    void generate2() {
        List<List<Integer>> expected = ArrayUtils.getLists(new int[][] {{1}});
        assertThat(new Solution().generate(1), equalTo(expected));
    }
}
