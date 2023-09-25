package g2401_2500.s2491_divide_players_into_teams_of_equal_skill;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void dividePlayers() {
        assertThat(new Solution().dividePlayers(new int[] {3, 2, 5, 1, 3, 4}), equalTo(22L));
    }

    @Test
    void dividePlayers2() {
        assertThat(new Solution().dividePlayers(new int[] {3, 4}), equalTo(12L));
    }

    @Test
    void dividePlayers3() {
        assertThat(new Solution().dividePlayers(new int[] {1, 1, 2, 3}), equalTo(-1L));
    }
}
