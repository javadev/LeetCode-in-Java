package g0401_0500.s0479_largest_palindrome_product;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

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
