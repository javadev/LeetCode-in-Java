package g0901_1000.s0912_sort_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void sortArray() {
        assertThat(
                new Solution().sortArray(new int[] {5, 2, 3, 1}), equalTo(new int[] {1, 2, 3, 5}));
    }

    @Test
    void sortArray2() {
        assertThat(
                new Solution().sortArray(new int[] {5, 1, 1, 2, 0, 0}),
                equalTo(new int[] {0, 0, 1, 1, 2, 5}));
    }
}
