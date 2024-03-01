package g1801_1900.s1822_sign_of_the_product_of_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arraySign() {
        assertThat(new Solution().arraySign(new int[] {-1, -2, -3, -4, 3, 2, 1}), equalTo(1));
    }

    @Test
    void arraySign2() {
        assertThat(new Solution().arraySign(new int[] {1, 5, 0, 2, -3}), equalTo(0));
    }

    @Test
    void arraySign3() {
        assertThat(new Solution().arraySign(new int[] {-1, 1, -1, 1, -1}), equalTo(-1));
    }
}
