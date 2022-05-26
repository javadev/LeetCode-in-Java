package g2001_2100.s2055_plates_between_candles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void platesBetweenCandles() {
        int[][] queries =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,5],[5,9]");
        assertThat(
                new Solution().platesBetweenCandles("**|**|***|", queries),
                equalTo(new int[] {2, 3}));
    }

    @Test
    void platesBetweenCandles2() {
        int[][] queries =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,17],[4,5],[14,17],[5,11],[15,16]");
        assertThat(
                new Solution().platesBetweenCandles("***|**|*****|**||**|*", queries),
                equalTo(new int[] {9, 0, 0, 0, 0}));
    }
}
