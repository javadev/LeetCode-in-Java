package g2601_2700.s2685_count_the_number_of_complete_components;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCompleteComponents() {
        assertThat(
                new Solution()
                        .countCompleteComponents(
                                6,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[1,2],[3,4]")),
                equalTo(3));
    }

    @Test
    void countCompleteComponents2() {
        assertThat(
                new Solution()
                        .countCompleteComponents(
                                6,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2],[1,2],[3,4],[3,5]")),
                equalTo(1));
    }
}
