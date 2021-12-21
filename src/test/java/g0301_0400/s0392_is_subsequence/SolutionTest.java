package g0301_0400.s0392_is_subsequence;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void isSubsequence() {
        assertThat(new Solution().isSubsequence("abc","ahbgdc"), equalTo(true));
    }

    @Test
    void isSubsequence2() {
        assertThat(new Solution().isSubsequence("axc","ahbgdc"), equalTo(false));
    }
}
