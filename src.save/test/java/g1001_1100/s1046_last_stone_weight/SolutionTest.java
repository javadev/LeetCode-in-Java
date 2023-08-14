package g1001_1100.s1046_last_stone_weight;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void lastStoneWeight() {
        assertThat(new Solution().lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}), equalTo(1));
    }

    @Test
    void lastStoneWeight2() {
        assertThat(new Solution().lastStoneWeight(new int[] {1}), equalTo(1));
    }
}
