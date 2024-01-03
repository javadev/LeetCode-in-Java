package g2901_3000.s2940_find_building_where_alice_and_bob_can_meet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void leftmostBuildingQueries() {
        assertThat(
                new Solution()
                        .leftmostBuildingQueries(
                                new int[] {6, 4, 8, 5, 2, 7},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,1],[0,3],[2,4],[3,4],[2,2]")),
                equalTo(new int[] {2, 5, -1, 5, 2}));
    }

    @Test
    void leftmostBuildingQueries2() {
        assertThat(
                new Solution()
                        .leftmostBuildingQueries(
                                new int[] {5, 3, 8, 2, 6, 1, 4, 6},
                                CommonUtils
                                        .convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                                "[0,7],[3,5],[5,2],[3,0],[1,6]")),
                equalTo(new int[] {7, 6, -1, 4, 6}));
    }
}
