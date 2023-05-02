package g1601_1700.s1626_best_team_with_no_conflicts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bestTeamScore() {
        assertThat(
                new Solution()
                        .bestTeamScore(new int[] {1, 3, 5, 10, 15}, new int[] {1, 2, 3, 4, 5}),
                equalTo(34));
    }

    @Test
    void bestTeamScore2() {
        assertThat(
                new Solution().bestTeamScore(new int[] {4, 5, 6, 5}, new int[] {2, 1, 2, 1}),
                equalTo(16));
    }

    @Test
    void bestTeamScore3() {
        assertThat(
                new Solution().bestTeamScore(new int[] {1, 2, 3, 5}, new int[] {8, 9, 10, 1}),
                equalTo(6));
    }
}
