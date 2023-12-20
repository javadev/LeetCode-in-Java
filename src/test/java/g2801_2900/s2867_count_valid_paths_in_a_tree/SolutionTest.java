package g2801_2900.s2867_count_valid_paths_in_a_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPaths() {
        assertThat(
                new Solution()
                        .countPaths(
                                5,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2],[1,3],[2,4],[2,5]")),
                equalTo(4L));
    }

    @Test
    void countPaths2() {
        assertThat(
                new Solution()
                        .countPaths(
                                6,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2],[1,3],[2,4],[3,5],[3,6]")),
                equalTo(6L));
    }
}
