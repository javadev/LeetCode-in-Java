package g1701_1800.s1726_tuple_with_same_product;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void tupleSameProduct() {
        assertThat(new Solution().tupleSameProduct(new int[] {2, 3, 4, 6}), equalTo(8));
    }

    @Test
    void tupleSameProduct2() {
        assertThat(new Solution().tupleSameProduct(new int[] {1, 2, 4, 5, 10}), equalTo(16));
    }
}
