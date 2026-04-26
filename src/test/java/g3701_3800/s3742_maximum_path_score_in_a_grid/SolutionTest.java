package g3701_3800.s3742_maximum_path_score_in_a_grid;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPathScore() {
        assertThat(new Solution().maxPathScore(new int[][] {{0, 1}, {2, 3}}, 1), equalTo(-1));
    }

    @Test
    void maxPathScore2() {
        assertThat(new Solution().maxPathScore(new int[][] {{0, 1}, {2, 3}}, 2), equalTo(5));
    }

    @Test
    void maxPathScore3() {
        assertThat(new Solution().maxPathScore(new int[][] {{-1, -2}, {-3, -4}}, 0), equalTo(-1));
    }
}
