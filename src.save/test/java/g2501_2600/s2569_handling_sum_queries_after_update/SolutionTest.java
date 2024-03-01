package g2501_2600.s2569_handling_sum_queries_after_update;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void handleQuery() {
        assertThat(
                new Solution()
                        .handleQuery(
                                new int[] {1, 0, 1},
                                new int[] {0, 0, 0},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1,1],[2,1,0],[3,0,0]")),
                equalTo(new long[] {3}));
    }

    @Test
    void handleQuery2() {
        assertThat(
                new Solution()
                        .handleQuery(
                                new int[] {1},
                                new int[] {5},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,0,0],[3,0,0]")),
                equalTo(new long[] {5}));
    }
}
