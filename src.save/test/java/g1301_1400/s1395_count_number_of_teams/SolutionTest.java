package g1301_1400.s1395_count_number_of_teams;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numTeams() {
        assertThat(new Solution().numTeams(new int[] {2, 5, 3, 4, 1}), equalTo(3));
    }

    @Test
    void numTeams2() {
        assertThat(new Solution().numTeams(new int[] {2, 1, 3}), equalTo(0));
    }

    @Test
    void numTeams3() {
        assertThat(new Solution().numTeams(new int[] {1, 2, 3, 4}), equalTo(4));
    }
}
