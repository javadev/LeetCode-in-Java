package g0501_0600.s0540_single_element_in_a_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void singleNonDuplicate() {
        assertThat(
                new Solution().singleNonDuplicate(new int[] {1, 1, 2, 3, 3, 4, 4, 8, 8}),
                equalTo(2));
    }

    @Test
    void singleNonDuplicate2() {
        assertThat(
                new Solution().singleNonDuplicate(new int[] {3, 3, 7, 7, 10, 11, 11}), equalTo(10));
    }
}
