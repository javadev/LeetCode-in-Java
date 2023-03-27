package g0901_1000.s0954_array_of_doubled_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canReorderDoubled() {
        assertThat(new Solution().canReorderDoubled(new int[] {3, 1, 3, 6}), equalTo(false));
    }

    @Test
    void canReorderDoubled2() {
        assertThat(new Solution().canReorderDoubled(new int[] {2, 1, 2, 6}), equalTo(false));
    }

    @Test
    void canReorderDoubled3() {
        assertThat(new Solution().canReorderDoubled(new int[] {4, -2, 2, -4}), equalTo(true));
    }
}
