package g0901_1000.s1000_minimum_cost_to_merge_stones;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeStones() {
        assertThat(new Solution().mergeStones(new int[] {3, 2, 4, 1}, 2), equalTo(20));
    }

    @Test
    void mergeStones2() {
        assertThat(new Solution().mergeStones(new int[] {3, 2, 4, 1}, 3), equalTo(-1));
    }

    @Test
    void mergeStones3() {
        assertThat(new Solution().mergeStones(new int[] {3, 5, 1, 2, 6}, 3), equalTo(25));
    }
}
