package g3801_3900.s3900_longest_balanced_substring_after_one_swap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void longestBalanced() {
        assertThat(new Solution().longestBalanced("100001"), equalTo(4));
    }

    @Test
    void longestBalanced2() {
        assertThat(new Solution().longestBalanced("111"), equalTo(0));
    }

    @Test
    void longestBalanced3() {
        assertThat(new Solution().longestBalanced("0000"), equalTo(0));
    }

    @Test
    void longestBalanced4() {
        assertThat(new Solution().longestBalanced("0"), equalTo(0));
    }

    @Test
    void longestBalanced5() {
        assertThat(new Solution().longestBalanced("1100"), equalTo(4));
    }

    @Test
    void longestBalanced6() {
        assertThat(new Solution().longestBalanced("0001000"), equalTo(2));
    }

    @Test
    void longestBalanced7() {
        assertThat(new Solution().longestBalanced("1100000011"), equalTo(6));
    }
}
