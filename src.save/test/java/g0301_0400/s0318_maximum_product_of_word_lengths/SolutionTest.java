package g0301_0400.s0318_maximum_product_of_word_lengths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxProduct() {
        assertThat(
                new Solution()
                        .maxProduct(new String[] {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"}),
                equalTo(16));
    }

    @Test
    void maxProduct2() {
        assertThat(
                new Solution()
                        .maxProduct(new String[] {"a", "ab", "abc", "d", "cd", "bcd", "abcd"}),
                equalTo(4));
    }
}
