package g2901_3000.s2961_double_modular_exponentiation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getGoodIndices() {
        assertThat(
                new Solution()
                        .getGoodIndices(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,3,3,10],[3,3,3,1],[6,1,1,4]"),
                                2),
                equalTo(List.of(0, 2)));
    }

    @Test
    void getGoodIndices2() {
        assertThat(
                new Solution().getGoodIndices(new int[][] {{39, 3, 1000, 1000}}, 17),
                equalTo(List.of()));
    }
}
