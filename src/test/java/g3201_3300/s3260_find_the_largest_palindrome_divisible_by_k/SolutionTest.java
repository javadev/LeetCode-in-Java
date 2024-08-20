package g3201_3300.s3260_find_the_largest_palindrome_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestPalindrome() {
        assertThat(new Solution().largestPalindrome(3, 5), equalTo("595"));
    }

    @Test
    void largestPalindrome2() {
        assertThat(new Solution().largestPalindrome(1, 4), equalTo("8"));
    }

    @Test
    void largestPalindrome3() {
        assertThat(new Solution().largestPalindrome(5, 6), equalTo("89898"));
    }
}
