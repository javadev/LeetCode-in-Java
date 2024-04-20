package g2601_2700.s2653_sliding_subarray_beauty;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getSubarrayBeauty() {
        assertThat(
                new Solution().getSubarrayBeauty(new int[] {1, -1, -3, -2, 3}, 3, 2),
                equalTo(new int[] {-1, -2, -2}));
    }

    @Test
    void getSubarrayBeauty2() {
        assertThat(
                new Solution().getSubarrayBeauty(new int[] {-1, -2, -3, -4, -5}, 2, 2),
                equalTo(new int[] {-1, -2, -3, -4}));
    }

    @Test
    void getSubarrayBeauty3() {
        assertThat(
                new Solution().getSubarrayBeauty(new int[] {-3, 1, 2, -3, 0, -3}, 2, 1),
                equalTo(new int[] {-3, 0, -3, -3, -3}));
    }
}
