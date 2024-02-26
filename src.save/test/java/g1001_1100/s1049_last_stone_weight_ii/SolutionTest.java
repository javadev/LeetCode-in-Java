package g1001_1100.s1049_last_stone_weight_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lastStoneWeightII() {
        assertThat(new Solution().lastStoneWeightII(new int[] {2, 7, 4, 1, 8, 1}), equalTo(1));
    }

    @Test
    void lastStoneWeightII2() {
        assertThat(new Solution().lastStoneWeightII(new int[] {31, 26, 33, 21, 40}), equalTo(5));
    }
}
