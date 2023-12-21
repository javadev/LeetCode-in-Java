package g1401_1500.s1439_find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthSmallest() {
        assertThat(new Solution().kthSmallest(new int[][] {{1, 3, 11}, {2, 4, 6}}, 5), equalTo(7));
    }

    @Test
    void kthSmallest2() {
        assertThat(new Solution().kthSmallest(new int[][] {{1, 3, 11}, {2, 4, 6}}, 9), equalTo(17));
    }

    @Test
    void kthSmallest3() {
        assertThat(
                new Solution().kthSmallest(new int[][] {{1, 10, 10}, {1, 4, 5}, {2, 3, 6}}, 7),
                equalTo(9));
    }
}
