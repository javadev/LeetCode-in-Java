package g1301_1400.s1366_rank_teams_by_votes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rankTeams() {
        assertThat(
                new Solution().rankTeams(new String[] {"ABC", "ACB", "ABC", "ACB", "ACB"}),
                equalTo("ACB"));
    }

    @Test
    void rankTeams2() {
        assertThat(new Solution().rankTeams(new String[] {"WXYZ", "XYZW"}), equalTo("XWYZ"));
    }

    @Test
    void rankTeams3() {
        assertThat(
                new Solution().rankTeams(new String[] {"ZMNAGUEDSJYLBOPHRQICWFXTVK"}),
                equalTo("ZMNAGUEDSJYLBOPHRQICWFXTVK"));
    }
}
