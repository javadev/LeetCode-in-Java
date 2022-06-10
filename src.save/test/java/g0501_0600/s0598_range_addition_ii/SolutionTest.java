package g0501_0600.s0598_range_addition_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCount() {
        int[][] javaArray =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,2],[3,3]");
        assertThat(new Solution().maxCount(3, 3, javaArray), equalTo(4));
    }

    @Test
    void maxCount2() {
        int[][] javaArray =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]");
        assertThat(new Solution().maxCount(3, 3, javaArray), equalTo(4));
    }

    @Test
    void maxCount3() {
        assertThat(new Solution().maxCount(3, 3, new int[][] {}), equalTo(9));
    }
}
