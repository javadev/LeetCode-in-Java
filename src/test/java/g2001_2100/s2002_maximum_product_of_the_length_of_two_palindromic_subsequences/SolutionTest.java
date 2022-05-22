package g2001_2100.s2002_maximum_product_of_the_length_of_two_palindromic_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(new Solution().maxProduct("leetcodecom"), equalTo(9));
    }

    @Test
    void maxProduct2() {
        assertThat(new Solution().maxProduct("bb"), equalTo(1));
    }

    @Test
    void maxProduct3() {
        assertThat(new Solution().maxProduct("accbcaxxcxx"), equalTo(25));
    }
}
