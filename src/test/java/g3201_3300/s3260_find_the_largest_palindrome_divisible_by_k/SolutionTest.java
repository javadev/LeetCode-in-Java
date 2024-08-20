package g3201_3300.s3260_find_the_largest_palindrome_divisible_by_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void largestPalindrome4() {
        Solution solution = new Solution();
        assertEquals("9", solution.largestPalindrome(1, 1));
        assertEquals("99", solution.largestPalindrome(2, 1));
        assertEquals("999", solution.largestPalindrome(3, 1));
    }

    @Test
    void largestPalindrome5() {
        Solution solution = new Solution();
        assertEquals("8", solution.largestPalindrome(1, 2));
        assertEquals("88", solution.largestPalindrome(2, 2));
        assertEquals("898", solution.largestPalindrome(3, 2));
        assertEquals("8998", solution.largestPalindrome(4, 2));
    }

    @Test
    void largestPalindrome6() {
        Solution solution = new Solution();
        assertEquals("9", solution.largestPalindrome(1, 3));
        assertEquals("99", solution.largestPalindrome(2, 3));
        assertEquals("999", solution.largestPalindrome(3, 3));
    }

    @Test
    void largestPalindrome7() {
        Solution solution = new Solution();
        assertEquals("8", solution.largestPalindrome(1, 4));
        assertEquals("88", solution.largestPalindrome(2, 4));
        assertEquals("888", solution.largestPalindrome(3, 4));
        assertEquals("8888", solution.largestPalindrome(4, 4));
        assertEquals("88988", solution.largestPalindrome(5, 4));
    }

    @Test
    void largestPalindrome8() {
        Solution solution = new Solution();
        assertEquals("5", solution.largestPalindrome(1, 5));
        assertEquals("55", solution.largestPalindrome(2, 5));
        assertEquals("595", solution.largestPalindrome(3, 5));
    }

    @Test
    void largestPalindrome9() {
        Solution solution = new Solution();
        assertEquals("6", solution.largestPalindrome(1, 6));
        assertEquals("66", solution.largestPalindrome(2, 6));
        assertEquals("8778", solution.largestPalindrome(4, 6));
    }

    @Test
    void largestPalindrome10() {
        Solution solution = new Solution();
        assertEquals("7", solution.largestPalindrome(1, 7));
        assertEquals("77", solution.largestPalindrome(2, 7));
        assertEquals("959", solution.largestPalindrome(3, 7));
        assertEquals("99799", solution.largestPalindrome(5, 7));
        assertEquals("999999", solution.largestPalindrome(6, 7));
        assertEquals("9994999", solution.largestPalindrome(7, 7));
    }

    @Test
    void largestPalindrome11() {
        Solution solution = new Solution();
        assertEquals("8", solution.largestPalindrome(1, 8));
        assertEquals("88", solution.largestPalindrome(2, 8));
        assertEquals("888", solution.largestPalindrome(3, 8));
        assertEquals("8888", solution.largestPalindrome(4, 8));
        assertEquals("88888", solution.largestPalindrome(5, 8));
    }

    @Test
    void largestPalindrome12() {
        Solution solution = new Solution();
        assertEquals("9", solution.largestPalindrome(1, 9));
        assertEquals("99", solution.largestPalindrome(2, 9));
        assertEquals("999", solution.largestPalindrome(3, 9));
    }
}
