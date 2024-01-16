package g1501_1600.s1578_minimum_time_to_make_rope_colorful;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCost() {
        assertThat(new Solution().minCost("abaac", new int[] {1, 2, 3, 4, 5}), equalTo(3));
    }

    @Test
    void minCost2() {
        assertThat(new Solution().minCost("abc", new int[] {1, 2, 3}), equalTo(0));
    }

    @Test
    void minCost3() {
        assertThat(new Solution().minCost("aabaa", new int[] {1, 2, 3, 4, 1}), equalTo(2));
    }
}
