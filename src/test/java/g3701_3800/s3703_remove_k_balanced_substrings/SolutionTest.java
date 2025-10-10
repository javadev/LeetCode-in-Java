package g3701_3800.s3703_remove_k_balanced_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeSubstring() {
        assertThat(new Solution().removeSubstring("(())", 1), equalTo(""));
    }

    @Test
    void removeSubstring2() {
        assertThat(new Solution().removeSubstring("(()(", 1), equalTo("(("));
    }

    @Test
    void removeSubstring3() {
        assertThat(new Solution().removeSubstring("((()))()()()", 3), equalTo("()()()"));
    }
}
