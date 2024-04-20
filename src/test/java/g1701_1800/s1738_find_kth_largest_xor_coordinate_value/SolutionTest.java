package g1701_1800.s1738_find_kth_largest_xor_coordinate_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthLargestValue() {
        assertThat(new Solution().kthLargestValue(new int[][] {{5, 2}, {1, 6}}, 1), equalTo(7));
    }

    @Test
    void kthLargestValue2() {
        assertThat(new Solution().kthLargestValue(new int[][] {{5, 2}, {1, 6}}, 2), equalTo(5));
    }

    @Test
    void kthLargestValue3() {
        assertThat(new Solution().kthLargestValue(new int[][] {{5, 2}, {1, 6}}, 3), equalTo(4));
    }
}
