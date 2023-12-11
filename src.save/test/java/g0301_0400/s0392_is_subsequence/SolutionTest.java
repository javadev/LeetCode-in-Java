package g0301_0400.s0392_is_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSubsequence() {
        assertThat(new Solution().isSubsequence("abc", "ahbgdc"), equalTo(true));
    }

    @Test
    void isSubsequence2() {
        assertThat(new Solution().isSubsequence("axc", "ahbgdc"), equalTo(false));
    }
}
