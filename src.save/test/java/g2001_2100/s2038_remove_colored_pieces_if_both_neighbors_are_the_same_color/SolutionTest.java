package g2001_2100.s2038_remove_colored_pieces_if_both_neighbors_are_the_same_color;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void winnerOfGame() {
        assertThat(new Solution().winnerOfGame("AAABABB"), equalTo(true));
    }

    @Test
    void winnerOfGame2() {
        assertThat(new Solution().winnerOfGame("AA"), equalTo(false));
    }

    @Test
    void winnerOfGame3() {
        assertThat(new Solution().winnerOfGame("ABBBBBBBAAA"), equalTo(false));
    }
}
