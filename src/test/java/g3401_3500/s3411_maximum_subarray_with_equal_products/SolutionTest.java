package g3401_3500.s3411_maximum_subarray_with_equal_products;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxLength() {
        assertThat(new Solution().maxLength(new int[] {1, 2, 1, 2, 1, 1, 1}), equalTo(5));
    }

    @Test
    void maxLength2() {
        assertThat(new Solution().maxLength(new int[] {2, 3, 4, 5, 6}), equalTo(3));
    }

    @Test
    void maxLength3() {
        assertThat(new Solution().maxLength(new int[] {1, 2, 3, 1, 4, 5, 1}), equalTo(5));
    }
}
