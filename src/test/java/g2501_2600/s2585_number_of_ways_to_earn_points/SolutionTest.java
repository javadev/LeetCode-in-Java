package g2501_2600.s2585_number_of_ways_to_earn_points;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void waysToReachTarget() {
        assertThat(
                new Solution()
                        .waysToReachTarget(
                                6,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[6,1],[3,2],[2,3]")),
                equalTo(7));
    }

    @Test
    void waysToReachTarget2() {
        assertThat(
                new Solution()
                        .waysToReachTarget(
                                5,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[50,1],[50,2],[50,5]")),
                equalTo(4));
    }
}
