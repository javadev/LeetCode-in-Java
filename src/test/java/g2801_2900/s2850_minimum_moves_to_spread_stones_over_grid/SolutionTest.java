package g2801_2900.s2850_minimum_moves_to_spread_stones_over_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumMoves() {
        assertThat(
                new Solution()
                        .minimumMoves(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1,0],[1,1,1],[1,2,1]")),
                equalTo(3));
    }

    @Test
    void minimumMoves2() {
        assertThat(
                new Solution()
                        .minimumMoves(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,3,0],[1,0,0],[1,0,3]")),
                equalTo(4));
    }
}
