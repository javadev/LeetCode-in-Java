package g0201_0300.s0238_product_of_array_except_self;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void productExceptSelf() {
        assertThat(
                new Solution().productExceptSelf(new int[] {1, 2, 3, 4}),
                equalTo(new int[] {24, 12, 8, 6}));
    }

    @Test
    void productExceptSelf2() {
        assertThat(
                new Solution().productExceptSelf(new int[] {-1, 1, 0, -3, 3}),
                equalTo(new int[] {0, 0, 9, 0, 0}));
    }
}
