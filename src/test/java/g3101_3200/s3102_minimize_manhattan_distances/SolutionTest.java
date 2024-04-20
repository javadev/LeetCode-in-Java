package g3101_3200.s3102_minimize_manhattan_distances;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDistance() {
        assertThat(
                new Solution()
                        .minimumDistance(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[3,10],[5,15],[10,2],[4,4]")),
                equalTo(12));
    }

    @Test
    void minimumDistance2() {
        assertThat(
                new Solution()
                        .minimumDistance(
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,1],[1,1],[1,1]")),
                equalTo(0));
    }
}
