package g2801_2900.s2872_maximum_number_of_k_divisible_components;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxKDivisibleComponents() {
        assertThat(
                new Solution()
                        .maxKDivisibleComponents(
                                5,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,2],[1,2],[1,3],[2,4]"),
                                new int[] {1, 8, 1, 4, 4},
                                6),
                equalTo(2));
    }

    @Test
    void maxKDivisibleComponents2() {
        assertThat(
                new Solution()
                        .maxKDivisibleComponents(
                                7,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[1,3],[1,4],[2,5],[2,6]"),
                                new int[] {3, 0, 6, 1, 5, 2, 1},
                                3),
                equalTo(3));
    }
}
