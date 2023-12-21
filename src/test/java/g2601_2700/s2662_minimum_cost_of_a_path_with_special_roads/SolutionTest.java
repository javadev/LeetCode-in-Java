package g2601_2700.s2662_minimum_cost_of_a_path_with_special_roads;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCost() {
        assertThat(
                new Solution()
                        .minimumCost(
                                new int[] {1, 1},
                                new int[] {4, 5},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,3,3,2],[3,4,4,5,1]")),
                equalTo(5));
    }

    @Test
    void minimumCost2() {
        assertThat(
                new Solution()
                        .minimumCost(
                                new int[] {3, 2},
                                new int[] {5, 7},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,2,3,4,4],[3,3,5,5,5],[3,4,5,6,6]")),
                equalTo(7));
    }
}
