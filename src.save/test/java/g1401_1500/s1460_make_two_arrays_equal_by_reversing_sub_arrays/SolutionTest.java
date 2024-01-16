package g1401_1500.s1460_make_two_arrays_equal_by_reversing_sub_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canBeEqual() {
        assertThat(
                new Solution().canBeEqual(new int[] {1, 2, 3, 4}, new int[] {2, 4, 1, 3}),
                equalTo(true));
    }

    @Test
    void canBeEqual2() {
        assertThat(new Solution().canBeEqual(new int[] {7}, new int[] {7}), equalTo(true));
    }

    @Test
    void canBeEqual3() {
        assertThat(
                new Solution().canBeEqual(new int[] {3, 7, 9}, new int[] {3, 7, 11}),
                equalTo(false));
    }
}
