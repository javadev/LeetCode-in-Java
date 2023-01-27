package g2401_2500.s2492_minimum_score_of_a_path_between_two_cities;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minScore() {
        assertThat(
                new Solution()
                        .minScore(
                                4,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,9],[2,3,6],[2,4,5],[1,4,7]")),
                equalTo(5));
    }

    @Test
    void minScore2() {
        assertThat(
                new Solution()
                        .minScore(
                                4,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2,2],[1,3,4],[3,4,7]")),
                equalTo(2));
    }
}
