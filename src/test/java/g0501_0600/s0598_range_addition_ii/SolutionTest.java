package g0501_0600.s0598_range_addition_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxCount() {
        assertThat(
                new Solution()
                        .maxCount(
                                3,
                                3,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,2],[3,3]")),
                equalTo(4));
    }
}
