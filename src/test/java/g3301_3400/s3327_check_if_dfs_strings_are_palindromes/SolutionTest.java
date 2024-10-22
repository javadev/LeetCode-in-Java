package g3301_3400.s3327_check_if_dfs_strings_are_palindromes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findAnswer() {
        assertThat(
                new Solution().findAnswer(new int[] {-1, 0, 0, 1, 1, 2}, "aababa"),
                equalTo(new boolean[] {true, true, false, true, true, true}));
    }

    @Test
    void findAnswer2() {
        assertThat(
                new Solution().findAnswer(new int[] {-1, 0, 0, 0, 0}, "aabcb"),
                equalTo(new boolean[] {true, true, true, true, true}));
    }
}
