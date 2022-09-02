package g2201_2300.s2217_find_palindrome_with_fixed_length;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthPalindrome() {
        assertThat(
                new Solution().kthPalindrome(new int[] {1, 2, 3, 4, 5, 90}, 3),
                equalTo(new long[] {101, 111, 121, 131, 141, 999}));
    }

    @Test
    void kthPalindrome2() {
        assertThat(
                new Solution().kthPalindrome(new int[] {2, 4, 6}, 4),
                equalTo(new long[] {1111, 1331, 1551}));
    }
}
