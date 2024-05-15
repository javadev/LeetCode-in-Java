package g3101_3200.s3148_maximum_difference_score_in_a_grid;

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
                                ArrayUtils.getLists(
                                        new int[][] {
                                            {9, 5, 7, 3}, {8, 9, 6, 1}, {6, 7, 14, 3}, {2, 5, 3, 1}
                                        })),
                equalTo(9));
    }

    @Test
    void maxScore2() {
        assertThat(
                new Solution().maxScore(ArrayUtils.getLists(new int[][] {{4, 3, 2}, {3, 2, 1}})),
                equalTo(-1));
    }
}
