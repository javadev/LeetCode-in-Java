package g2401_2500.s2493_divide_nodes_into_the_maximum_number_of_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void magnificentSets() {
        assertThat(
                new Solution()
                        .magnificentSets(
                                6,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2],[1,4],[1,5],[2,6],[2,3],[4,6]")),
                equalTo(4));
    }

    @Test
    void magnificentSets2() {
        assertThat(
                new Solution()
                        .magnificentSets(
                                3,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[1,2],[2,3],[3,1]")),
                equalTo(-1));
    }
}
