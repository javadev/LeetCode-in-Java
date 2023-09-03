package g0801_0900.s0846_hand_of_straights;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isNStraightHand() {
        assertThat(
                new Solution().isNStraightHand(new int[] {1, 2, 3, 6, 2, 3, 4, 7, 8}, 3),
                equalTo(true));
    }

    @Test
    void isNStraightHand2() {
        assertThat(new Solution().isNStraightHand(new int[] {1, 2, 3, 4, 5}, 4), equalTo(false));
    }
}
