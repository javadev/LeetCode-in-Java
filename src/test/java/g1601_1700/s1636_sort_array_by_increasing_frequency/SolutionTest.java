package g1601_1700.s1636_sort_array_by_increasing_frequency;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void frequencySort() {
        assertThat(
                new Solution().frequencySort(new int[] {1, 1, 2, 2, 2, 3}),
                equalTo(new int[] {3, 1, 1, 2, 2, 2}));
    }

    @Test
    void frequencySort2() {
        assertThat(
                new Solution().frequencySort(new int[] {2, 3, 1, 3, 2}),
                equalTo(new int[] {1, 3, 3, 2, 2}));
    }

    @Test
    void frequencySort3() {
        assertThat(
                new Solution().frequencySort(new int[] {-1, 1, -6, 4, 5, -6, 1, 4, 1}),
                equalTo(new int[] {5, -1, 4, 4, -6, -6, 1, 1, 1}));
    }
}
