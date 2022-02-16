package g0901_1000.s0950_reveal_cards_in_increasing_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void deckRevealedIncreasing() {
        assertThat(
                new Solution().deckRevealedIncreasing(new int[] {17, 13, 11, 2, 3, 5, 7}),
                equalTo(new int[] {2, 13, 3, 11, 5, 17, 7}));
    }

    @Test
    void deckRevealedIncreasing2() {
        assertThat(
                new Solution().deckRevealedIncreasing(new int[] {1, 1000}),
                equalTo(new int[] {1, 1000}));
    }
}
