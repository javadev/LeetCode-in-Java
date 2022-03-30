package g0901_1000.s0945_minimum_increment_to_make_array_unique;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minIncrementForUnique() {
        assertThat(new Solution().minIncrementForUnique(new int[] {1, 2, 2}), equalTo(1));
    }

    @Test
    void minIncrementForUnique2() {
        assertThat(new Solution().minIncrementForUnique(new int[] {3, 2, 1, 2, 1, 7}), equalTo(6));
    }
}
