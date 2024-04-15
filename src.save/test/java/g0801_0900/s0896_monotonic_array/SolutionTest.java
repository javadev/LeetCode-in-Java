package g0801_0900.s0896_monotonic_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isMonotonic() {
        assertThat(new Solution().isMonotonic(new int[] {1, 2, 2, 3}), equalTo(true));
    }

    @Test
    void isMonotonic2() {
        assertThat(new Solution().isMonotonic(new int[] {6, 5, 4, 4}), equalTo(true));
    }

    @Test
    void isMonotonic3() {
        assertThat(new Solution().isMonotonic(new int[] {1, 3, 2}), equalTo(false));
    }
}
