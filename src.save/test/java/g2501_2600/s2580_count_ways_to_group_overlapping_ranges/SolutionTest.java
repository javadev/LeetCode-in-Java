package g2501_2600.s2580_count_ways_to_group_overlapping_ranges;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countWays() {
        assertThat(
                new Solution()
                        .countWays(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[6,10],[5,15]")),
                equalTo(2));
    }

    @Test
    void countWays2() {
        assertThat(
                new Solution()
                        .countWays(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,3],[10,20],[2,5],[4,8]")),
                equalTo(4));
    }
}
