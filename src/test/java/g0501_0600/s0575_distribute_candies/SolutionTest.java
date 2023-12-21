package g0501_0600.s0575_distribute_candies;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void distributeCandies() {
        assertThat(new Solution().distributeCandies(new int[] {1, 1, 2, 2, 3, 3}), equalTo(3));
    }

    @Test
    void distributeCandies2() {
        assertThat(new Solution().distributeCandies(new int[] {1, 1, 2, 3}), equalTo(2));
    }

    @Test
    void distributeCandies3() {
        assertThat(new Solution().distributeCandies(new int[] {6, 6, 6, 6}), equalTo(1));
    }
}
