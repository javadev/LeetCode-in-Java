package g1301_1400.s1332_remove_palindromic_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removePalindromeSub() {
        assertThat(new Solution().removePalindromeSub("ababa"), equalTo(1));
    }

    @Test
    void removePalindromeSub2() {
        assertThat(new Solution().removePalindromeSub("abb"), equalTo(2));
    }

    @Test
    void removePalindromeSub3() {
        assertThat(new Solution().removePalindromeSub("baabb"), equalTo(2));
    }
}
