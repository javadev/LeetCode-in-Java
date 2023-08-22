package g2501_2600.s2581_count_number_of_possible_root_nodes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rootCount() {
        assertThat(
                new Solution()
                        .rootCount(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[1,2],[1,3],[4,2]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,3],[0,1],[1,0],[2,4]"),
                                3),
                equalTo(3));
    }

    @Test
    void rootCount2() {
        assertThat(
                new Solution()
                        .rootCount(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[1,2],[2,3],[3,4]"),
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,0],[3,4],[2,1],[3,2]"),
                                1),
                equalTo(5));
    }
}
