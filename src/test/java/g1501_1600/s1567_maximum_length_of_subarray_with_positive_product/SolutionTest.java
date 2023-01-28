package g1501_1600.s1567_maximum_length_of_subarray_with_positive_product;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMaxLen() {
        assertThat(new Solution().getMaxLen(new int[] {1, -2, -3, 4}), equalTo(4));
    }

    @Test
    void getMaxLen2() {
        assertThat(new Solution().getMaxLen(new int[] {0, 1, -2, -3, -4}), equalTo(3));
    }

    @Test
    void getMaxLen3() {
        assertThat(new Solution().getMaxLen(new int[] {-1, -2, -3, 0, 1}), equalTo(2));
    }
}
