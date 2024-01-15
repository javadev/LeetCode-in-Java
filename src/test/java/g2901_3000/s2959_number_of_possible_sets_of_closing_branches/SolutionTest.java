package g2901_3000.s2959_number_of_possible_sets_of_closing_branches;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfSets() {
        assertThat(
                new Solution()
                        .numberOfSets(
                                3,
                                5,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1,2],[1,2,10],[0,2,10]")),
                equalTo(5));
    }

    @Test
    void numberOfSets2() {
        assertThat(
                new Solution()
                        .numberOfSets(
                                3,
                                5,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1,20],[0,1,10],[1,2,2],[0,2,2]")),
                equalTo(7));
    }

    @Test
    void numberOfSets3() {
        assertThat(new Solution().numberOfSets(1, 10, new int[][] {}), equalTo(2));
    }
}
