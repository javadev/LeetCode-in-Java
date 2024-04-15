package g3001_3100.s3071_minimum_operations_to_write_the_letter_y_on_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperationsToWriteY() {
        assertThat(
                new Solution()
                        .minimumOperationsToWriteY(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,2],[1,1,0],[0,1,0]")),
                equalTo(3));
    }

    @Test
    void minimumOperationsToWriteY2() {
        assertThat(
                new Solution()
                        .minimumOperationsToWriteY(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1,0,1,0],[2,1,0,1,2],[2,2,2,0,1],[2,2,2,2,2],[2,1,2,2,2]")),
                equalTo(12));
    }
}
