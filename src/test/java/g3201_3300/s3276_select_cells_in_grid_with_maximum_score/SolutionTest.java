package g3201_3300.s3276_select_cells_in_grid_with_maximum_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxScore() {
        assertThat(
                new Solution()
                        .maxScore(
                                ArrayUtils.getLists(new int[][] {{1, 2, 3}, {4, 3, 2}, {1, 1, 1}})),
                equalTo(8));
    }

    @Test
    void maxScore2() {
        assertThat(
                new Solution().maxScore(ArrayUtils.getLists(new int[][] {{8, 7, 6}, {8, 3, 2}})),
                equalTo(15));
    }
}
