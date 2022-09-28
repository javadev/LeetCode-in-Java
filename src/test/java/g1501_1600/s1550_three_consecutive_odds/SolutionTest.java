package g1501_1600.s1550_three_consecutive_odds;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void threeConsecutiveOdds() {
        assertThat(new Solution().threeConsecutiveOdds(new int[] {2, 6, 4, 1}), equalTo(false));
    }

    @Test
    void threeConsecutiveOdds2() {
        assertThat(
                new Solution().threeConsecutiveOdds(new int[] {1, 2, 34, 3, 4, 5, 7, 23, 12}),
                equalTo(true));
    }
}
