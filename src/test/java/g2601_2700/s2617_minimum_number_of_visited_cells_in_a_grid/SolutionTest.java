package g2601_2700.s2617_minimum_number_of_visited_cells_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumVisitedCells() {
        assertThat(
                new Solution()
                        .minimumVisitedCells(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,4,2,1],[4,2,3,1],[2,1,0,0],[2,4,0,0]")),
                equalTo(4));
    }

    @Test
    void minimumVisitedCells2() {
        assertThat(
                new Solution()
                        .minimumVisitedCells(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,4,2,1],[4,2,1,1],[2,1,1,0],[3,4,1,0]")),
                equalTo(3));
    }

    @Test
    void minimumVisitedCells3() {
        assertThat(
                new Solution()
                        .minimumVisitedCells(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[2,1,0],[1,0,0]")),
                equalTo(-1));
    }
}
