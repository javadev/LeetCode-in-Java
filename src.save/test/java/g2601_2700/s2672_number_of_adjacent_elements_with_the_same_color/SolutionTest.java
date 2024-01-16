package g2601_2700.s2672_number_of_adjacent_elements_with_the_same_color;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void colorTheArray() {
        assertThat(
                new Solution()
                        .colorTheArray(
                                4,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,2],[1,2],[3,1],[1,1],[2,1]")),
                equalTo(new int[] {0, 1, 1, 0, 2}));
    }

    @Test
    void colorTheArray2() {
        assertThat(
                new Solution()
                        .colorTheArray(
                                1,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,100000]")),
                equalTo(new int[] {0}));
    }
}
