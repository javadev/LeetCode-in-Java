package g1101_1200.s1122_relative_sort_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void relativeSortArray() {
        assertThat(
                new Solution()
                        .relativeSortArray(
                                new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                                new int[] {2, 1, 4, 3, 9, 6}),
                equalTo(new int[] {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}));
    }

    @Test
    void relativeSortArray2() {
        assertThat(
                new Solution()
                        .relativeSortArray(
                                new int[] {28, 6, 22, 8, 44, 17}, new int[] {22, 28, 8, 6}),
                equalTo(new int[] {22, 28, 8, 6, 17, 44}));
    }
}
