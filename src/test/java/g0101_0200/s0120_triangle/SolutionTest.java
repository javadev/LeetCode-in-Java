package g0101_0200.s0120_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTotal() {
        assertThat(
                new Solution()
                        .minimumTotal(
                                ArrayUtils.getLists(
                                        new int[][] {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}})),
                equalTo(11));
    }
}
