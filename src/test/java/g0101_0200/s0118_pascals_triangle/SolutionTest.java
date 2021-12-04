package g0101_0200.s0118_pascals_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void generate() {
        assertThat(
                new Solution().generate(5),
                equalTo(
                        ArrayUtils.getLists(
                                new int[][] {
                                    {1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}
                                })));
    }
}
