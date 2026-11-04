package g3901_4000.s3983_subsequence_after_one_replacement;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMakeSubsequence() {
        assertThat(new Solution().canMakeSubsequence("cat", "chat"), equalTo(true));
    }

    @Test
    void canMakeSubsequence2() {
        assertThat(new Solution().canMakeSubsequence("plane", "apple"), equalTo(false));
    }

    @Test
    void canMakeSubsequence3() {
        assertThat(new Solution().canMakeSubsequence("abc", "abc"), equalTo(true));
    }
}
