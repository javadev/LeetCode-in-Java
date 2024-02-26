package g2501_2600.s2577_minimum_time_to_visit_a_cell_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumTime() {
        assertThat(
                new Solution()
                        .minimumTime(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1,3,2],[5,1,2,5],[4,3,8,6]")),
                equalTo(7));
    }

    @Test
    void minimumTime2() {
        assertThat(
                new Solution()
                        .minimumTime(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,2,4],[3,2,1],[1,0,4]")),
                equalTo(-1));
    }
}
