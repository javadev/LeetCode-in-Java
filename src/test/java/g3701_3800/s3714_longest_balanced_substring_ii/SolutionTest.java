package g3701_3800.s3714_longest_balanced_substring_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestBalanced() {
        assertThat(new Solution().longestBalanced("abbac"), equalTo(4));
    }

    @Test
    void longestBalanced2() {
        assertThat(new Solution().longestBalanced("aabcc"), equalTo(3));
    }

    @Test
    void longestBalanced3() {
        assertThat(new Solution().longestBalanced("aba"), equalTo(2));
    }
}
