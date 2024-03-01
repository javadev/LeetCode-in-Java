package g2901_3000.s2911_minimum_changes_to_make_k_semi_palindromes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumChanges() {
        assertThat(new Solution().minimumChanges("abcac", 2), equalTo(1));
    }

    @Test
    void minimumChanges2() {
        assertThat(new Solution().minimumChanges("abcdef", 2), equalTo(2));
    }

    @Test
    void minimumChanges3() {
        assertThat(new Solution().minimumChanges("aabbaa", 3), equalTo(0));
    }
}
