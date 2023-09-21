package g2701_2800.s2772_apply_operations_to_make_all_array_elements_equal_to_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkArray() {
        assertThat(new Solution().checkArray(new int[] {2, 2, 3, 1, 1, 0}, 3), equalTo(true));
    }

    @Test
    void checkArray2() {
        assertThat(new Solution().checkArray(new int[] {1, 3, 1, 1}, 2), equalTo(false));
    }
}
