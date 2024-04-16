package g3001_3100.s3080_mark_elements_on_array_by_performing_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void unmarkedSumArray() {
        assertThat(
                new Solution()
                        .unmarkedSumArray(
                                new int[] {1, 2, 2, 1, 2, 3, 1},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2],[3,3],[4,2]")),
                equalTo(new long[] {8, 3, 0}));
    }

    @Test
    void unmarkedSumArray2() {
        assertThat(
                new Solution().unmarkedSumArray(new int[] {1, 4, 2, 3}, new int[][] {{0, 1}}),
                equalTo(new long[] {7}));
    }
}
