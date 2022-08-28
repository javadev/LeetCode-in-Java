package g1601_1700.s1655_distribute_repeating_integers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canDistribute() {
        assertThat(
                new Solution().canDistribute(new int[] {1, 2, 3, 4}, new int[] {2}),
                equalTo(false));
    }

    @Test
    void canDistribute2() {
        assertThat(
                new Solution().canDistribute(new int[] {1, 2, 3, 3}, new int[] {2}), equalTo(true));
    }

    @Test
    void canDistribute3() {
        assertThat(
                new Solution().canDistribute(new int[] {1, 1, 2, 2}, new int[] {2, 2}),
                equalTo(true));
    }
}
