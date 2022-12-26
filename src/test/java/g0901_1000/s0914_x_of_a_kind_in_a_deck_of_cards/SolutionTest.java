package g0901_1000.s0914_x_of_a_kind_in_a_deck_of_cards;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hasGroupsSizeX() {
        assertThat(
                new Solution().hasGroupsSizeX(new int[] {1, 2, 3, 4, 4, 3, 2, 1}), equalTo(true));
    }

    @Test
    void hasGroupsSizeX2() {
        assertThat(
                new Solution().hasGroupsSizeX(new int[] {1, 1, 1, 2, 2, 2, 3, 3}), equalTo(false));
    }
}
