package g3701_3800.s3771_total_score_of_dungeon_runs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalScore() {
        assertThat(
                new Solution().totalScore(11, new int[] {3, 6, 7}, new int[] {4, 2, 5}),
                equalTo(3L));
    }

    @Test
    void totalScore2() {
        assertThat(
                new Solution().totalScore(2, new int[] {10000, 1}, new int[] {1, 1}), equalTo(1L));
    }
}
