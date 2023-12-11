package g0301_0400.s0324_wiggle_sort_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wiggleSort() {
        int[] array = {1, 5, 1, 1, 6, 4};
        new Solution().wiggleSort(array);
        assertThat(array, equalTo(new int[] {1, 6, 1, 5, 1, 4}));
    }

    @Test
    void wiggleSort2() {
        int[] array = {1, 3, 2, 2, 3, 1};
        new Solution().wiggleSort(array);
        assertThat(array, equalTo(new int[] {2, 3, 1, 3, 1, 2}));
    }
}
