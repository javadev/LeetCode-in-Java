package g2601_2700.s2658_maximum_number_of_fish_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxFish() {
        assertThat(
                new Solution()
                        .findMaxFish(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]")),
                equalTo(7));
    }

    @Test
    void findMaxFish2() {
        assertThat(
                new Solution()
                        .findMaxFish(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,1]")),
                equalTo(1));
    }
}
