package g0801_0900.s0875_koko_eating_bananas;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minEatingSpeed() {
        assertThat(new Solution().minEatingSpeed(new int[] {3, 6, 7, 11}, 8), equalTo(4));
    }

    @Test
    void minEatingSpeed2() {
        assertThat(new Solution().minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5), equalTo(30));
    }

    @Test
    void minEatingSpeed3() {
        assertThat(new Solution().minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 6), equalTo(23));
    }
}
