package g2901_3000.s2905_find_indices_with_index_and_value_difference_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findIndices() {
        assertThat(
                new Solution().findIndices(new int[] {5, 1, 4, 1}, 2, 4),
                equalTo(new int[] {0, 3}));
    }

    @Test
    void findIndices2() {
        assertThat(new Solution().findIndices(new int[] {2, 1}, 0, 0), equalTo(new int[] {0, 0}));
    }

    @Test
    void findIndices3() {
        assertThat(
                new Solution().findIndices(new int[] {1, 2, 3}, 2, 4), equalTo(new int[] {-1, -1}));
    }
}
