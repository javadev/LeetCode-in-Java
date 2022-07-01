package g1001_1100.s1039_minimum_score_triangulation_of_polygon;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minScoreTriangulation() {
        assertThat(new Solution().minScoreTriangulation(new int[] {1, 2, 3}), equalTo(6));
    }

    @Test
    void minScoreTriangulation2() {
        assertThat(new Solution().minScoreTriangulation(new int[] {3, 7, 4, 5}), equalTo(144));
    }

    @Test
    void minScoreTriangulation3() {
        assertThat(new Solution().minScoreTriangulation(new int[] {1, 3, 1, 4, 1, 5}), equalTo(13));
    }
}
