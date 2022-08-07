package g2301_2400.s2357_make_array_zero_by_subtracting_equal_amounts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(new Solution().minimumOperations(new int[] {1, 5, 0, 3, 5}), equalTo(3));
    }

    @Test
    void minimumOperations2() {
        assertThat(new Solution().minimumOperations(new int[] {0}), equalTo(0));
    }
}
