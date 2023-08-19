package g2501_2600.s2558_take_gifts_from_the_richest_pile;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pickGifts() {
        assertThat(new Solution().pickGifts(new int[] {25, 64, 9, 4, 100}, 4), equalTo(29L));
    }

    @Test
    void pickGifts2() {
        assertThat(new Solution().pickGifts(new int[] {1, 1, 1, 1}, 4), equalTo(4L));
    }
}
