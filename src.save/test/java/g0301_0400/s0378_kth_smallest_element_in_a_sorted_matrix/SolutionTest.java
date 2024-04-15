package g0301_0400.s0378_kth_smallest_element_in_a_sorted_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthSmallest() {
        assertThat(
                new Solution().kthSmallest(new int[][] {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}}, 8),
                equalTo(13));
    }

    @Test
    void kthSmallest2() {
        assertThat(new Solution().kthSmallest(new int[][] {{-5}}, 1), equalTo(-5));
    }
}
