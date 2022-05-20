package g1901_2000.s1960_maximum_product_of_the_length_of_two_palindromic_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(new Solution().maxProduct("ababbb"), equalTo(9L));
    }

    @Test
    void maxProduct2() {
        assertThat(new Solution().maxProduct("zaaaxbbby"), equalTo(9L));
    }
}
