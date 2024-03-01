package g3001_3100.s3035_maximum_palindromes_after_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPalindromesAfterOperations() {
        assertThat(
                new Solution().maxPalindromesAfterOperations(new String[] {"abbb", "ba", "aa"}),
                equalTo(3));
    }

    @Test
    void maxPalindromesAfterOperations2() {
        assertThat(
                new Solution().maxPalindromesAfterOperations(new String[] {"abc", "ab"}),
                equalTo(2));
    }

    @Test
    void maxPalindromesAfterOperations3() {
        assertThat(
                new Solution().maxPalindromesAfterOperations(new String[] {"cd", "ef", "a"}),
                equalTo(1));
    }
}
