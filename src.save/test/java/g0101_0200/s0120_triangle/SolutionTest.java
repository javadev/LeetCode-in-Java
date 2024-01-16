package g0101_0200.s0120_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTotal() {
        List<List<Integer>> triangle =
                ArrayUtils.getLists(new int[][] {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}});
        assertThat(new Solution().minimumTotal(triangle), equalTo(11));
    }

    @Test
    void minimumTotal2() {
        List<List<Integer>> triangle = ArrayUtils.getLists(new int[][] {{-10}});
        assertThat(new Solution().minimumTotal(triangle), equalTo(-10));
    }
}
