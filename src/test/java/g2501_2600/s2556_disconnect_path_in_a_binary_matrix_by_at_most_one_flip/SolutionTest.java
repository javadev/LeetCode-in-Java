package g2501_2600.s2556_disconnect_path_in_a_binary_matrix_by_at_most_one_flip;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPossibleToCutPath() {
        assertThat(
                new Solution()
                        .isPossibleToCutPath(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1,1],[1,0,0],[1,1,1]")),
                equalTo(true));
    }

    @Test
    void isPossibleToCutPath2() {
        assertThat(
                new Solution()
                        .isPossibleToCutPath(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1,1],[1,0,1],[1,1,1]")),
                equalTo(false));
    }
}
