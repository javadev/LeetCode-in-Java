package g1701_1800.s1743_restore_the_array_from_adjacent_pairs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void restoreArray() {
        assertThat(
                new Solution().restoreArray(new int[][] {{2, 1}, {3, 4}, {3, 2}}),
                equalTo(new int[] {1, 2, 3, 4}));
    }

    @Test
    void restoreArray2() {
        assertThat(
                new Solution().restoreArray(new int[][] {{4, -2}, {1, 4}, {-3, 1}}),
                equalTo(new int[] {-2, 4, 1, -3}));
    }

    @Test
    void restoreArray3() {
        assertThat(
                new Solution().restoreArray(new int[][] {{100000, -100000}}),
                equalTo(new int[] {100000, -100000}));
    }
}
