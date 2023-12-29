package g2901_3000.s2920_maximum_points_after_collecting_coins_from_all_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumPoints() {
        assertThat(
                new Solution()
                        .maximumPoints(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[1,2],[2,3]"),
                                new int[] {10, 10, 3, 3},
                                5),
                equalTo(11));
    }

    @Test
    void maximumPoints2() {
        assertThat(
                new Solution()
                        .maximumPoints(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2]"),
                                new int[] {8, 4, 4},
                                0),
                equalTo(16));
    }
}
