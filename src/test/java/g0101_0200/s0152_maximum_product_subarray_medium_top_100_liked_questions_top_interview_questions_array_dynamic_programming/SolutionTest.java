package g0101_0200.s0152_maximum_product_subarray;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxProduct() {
        assertThat(new Solution().maxProduct(new int[] {2, 3, -2, 4}), equalTo(6));
    }
}
