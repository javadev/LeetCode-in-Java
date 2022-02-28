package g0701_0800.s0781_rabbits_in_forest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numRabbits() {
        assertThat(new Solution().numRabbits(new int[] {1, 1, 2}), equalTo(5));
    }

    @Test
    void numRabbits2() {
        assertThat(new Solution().numRabbits(new int[] {10, 10, 10}), equalTo(11));
    }

    @Test
    void numRabbits3() {
        assertThat(new Solution().numRabbits(new int[] {1, 0, 1, 0, 0}), equalTo(5));
    }
}
