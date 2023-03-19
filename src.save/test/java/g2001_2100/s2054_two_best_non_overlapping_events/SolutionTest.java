package g2001_2100.s2054_two_best_non_overlapping_events;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTwoEvents1() {
        int[][] events =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,3,2],[4,5,2],[2,4,3]");
        assertThat(new Solution().maxTwoEvents(events), equalTo(4));
    }

    @Test
    void maxTwoEvents2() {
        int[][] events =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,3,2],[4,5,2],[1,5,5]");
        assertThat(new Solution().maxTwoEvents(events), equalTo(5));
    }

    @Test
    void maxTwoEvents3() {
        int[][] events =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,5,3],[1,5,1],[6,6,5]");
        assertThat(new Solution().maxTwoEvents(events), equalTo(8));
    }
}
