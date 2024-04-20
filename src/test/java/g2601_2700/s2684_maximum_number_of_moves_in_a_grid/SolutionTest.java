package g2601_2700.s2684_maximum_number_of_moves_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxMoves() {
        assertThat(
                new Solution()
                        .maxMoves(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,4,3,5],[5,4,9,3],[3,4,2,11],[10,9,13,15]")),
                equalTo(3));
    }

    @Test
    void maxMoves2() {
        assertThat(
                new Solution()
                        .maxMoves(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,2,4],[2,1,9],[1,1,7]")),
                equalTo(0));
    }
}
