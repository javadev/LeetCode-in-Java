package g2201_2300.s2260_minimum_consecutive_cards_to_pick_up;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumCardPickup() {
        assertThat(new Solution().minimumCardPickup(new int[] {3, 4, 2, 3, 4, 7}), equalTo(4));
    }

    @Test
    void minimumCardPickup2() {
        assertThat(new Solution().minimumCardPickup(new int[] {1, 0, 5, 3}), equalTo(-1));
    }
}
