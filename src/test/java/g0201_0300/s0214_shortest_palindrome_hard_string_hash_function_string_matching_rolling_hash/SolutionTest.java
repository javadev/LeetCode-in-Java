package g0201_0300.s0214_shortest_palindrome_hard_string_hash_function_string_matching_rolling_hash;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void shortestPalindrome() {
        assertThat(new Solution().shortestPalindrome("aacecaaa"), equalTo("aaacecaaa"));
    }
}
