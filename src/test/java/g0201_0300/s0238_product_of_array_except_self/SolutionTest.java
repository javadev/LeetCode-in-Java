package g0201_0300.s0238_product_of_array_except_self;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void productExceptSelf() {
        assertThat(
                new Solution().productExceptSelf(new int[] {1, 2, 3, 4}),
                equalTo(new int[] {24, 12, 8, 6}));
    }
}
