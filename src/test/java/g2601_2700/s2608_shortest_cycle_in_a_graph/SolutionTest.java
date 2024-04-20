package g2601_2700.s2608_shortest_cycle_in_a_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findShortestCycle() {
        assertThat(
                new Solution()
                        .findShortestCycle(
                                7,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[1,2],[2,0],[3,4],[4,5],[5,6],[6,3]")),
                equalTo(3));
    }

    @Test
    void findShortestCycle2() {
        assertThat(
                new Solution()
                        .findShortestCycle(
                                4,
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,2]")),
                equalTo(-1));
    }
}
