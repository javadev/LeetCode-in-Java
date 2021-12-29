package g0401_0500.s0479_largest_palindrome_product;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestPalindrome() {
        assertThat(new Solution().largestPalindrome(2), equalTo(987));
    }

    @Test
    void largestPalindrome2() {
        assertThat(new Solution().largestPalindrome(1), equalTo(9));
    }
}
