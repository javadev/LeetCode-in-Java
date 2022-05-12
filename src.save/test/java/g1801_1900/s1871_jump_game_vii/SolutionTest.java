package g1801_1900.s1871_jump_game_vii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canReach() {
        assertThat(new Solution().canReach("011010", 2, 3), equalTo(true));
    }

    @Test
    void canReach2() {
        assertThat(new Solution().canReach("01101110", 2, 3), equalTo(false));
    }
}
