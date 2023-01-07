package g0401_0500.s0452_minimum_number_of_arrows_to_burst_balloons;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMinArrowShots() {
        int[][] points =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[10,16],[2,8],[1,6],[7,12]");
        assertThat(new Solution().findMinArrowShots(points), equalTo(2));
    }

    @Test
    void findMinArrowShots2() {
        int[][] points =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[3,4],[5,6],[7,8]");
        assertThat(new Solution().findMinArrowShots(points), equalTo(4));
    }

    @Test
    void findMinArrowShots3() {
        int[][] points =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[2,3],[3,4],[4,5]");
        assertThat(new Solution().findMinArrowShots(points), equalTo(2));
    }
}
