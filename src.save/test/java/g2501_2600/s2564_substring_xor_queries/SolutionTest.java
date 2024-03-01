package g2501_2600.s2564_substring_xor_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void substringXorQueries() {
        assertThat(
                new Solution()
                        .substringXorQueries(
                                "101101",
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,5],[1,2]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,2],[2,3]")));
    }

    @Test
    void substringXorQueries2() {
        assertThat(
                new Solution()
                        .substringXorQueries(
                                "0101",
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[12,8]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[-1,-1]")));
    }

    @Test
    void substringXorQueries3() {
        assertThat(
                new Solution()
                        .substringXorQueries(
                                "1",
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[4,5]")),
                equalTo(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,0]")));
    }
}
