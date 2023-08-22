package g2501_2600.s2589_minimum_time_to_complete_all_tasks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMinimumTime() {
        assertThat(
                new Solution()
                        .findMinimumTime(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,3,1],[4,5,1],[1,5,2]")),
                equalTo(2));
    }

    @Test
    void findMinimumTime2() {
        assertThat(
                new Solution()
                        .findMinimumTime(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,3,2],[2,5,3],[5,6,2]")),
                equalTo(4));
    }
}
