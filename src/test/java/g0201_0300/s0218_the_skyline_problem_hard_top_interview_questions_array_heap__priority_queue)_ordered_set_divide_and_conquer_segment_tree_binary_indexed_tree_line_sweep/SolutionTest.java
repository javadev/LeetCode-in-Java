package g0201_0300.s0218_the_skyline_problem;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void getSkyline() {
        int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        int[][] expected = {{2, 10}, {3, 15}, {7, 12}, {12, 0}, {15, 10}, {20, 8}, {24, 0}};
        assertThat(new Solution().getSkyline(buildings), equalTo(ArrayUtils.getLists(expected)));
    }
}
