package g2801_2900.s2825_make_string_a_subsequence_using_cyclic_increments;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canMakeSubsequence() {
        assertThat(new Solution().canMakeSubsequence("abc", "ad"), equalTo(true));
    }

    @Test
    void canMakeSubsequence2() {
        assertThat(new Solution().canMakeSubsequence("zc", "ad"), equalTo(true));
    }

    @Test
    void canMakeSubsequence3() {
        assertThat(new Solution().canMakeSubsequence("ab", "d"), equalTo(false));
    }
}
