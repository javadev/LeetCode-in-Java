package g0501_0600.s0521_longest_uncommon_subsequence_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLUSlength() {
        assertThat(new Solution().findLUSlength("aba", "cdc"), equalTo(3));
    }

    @Test
    void findLUSlength2() {
        assertThat(new Solution().findLUSlength("aaa", "bbb"), equalTo(3));
    }

    @Test
    void findLUSlength3() {
        assertThat(new Solution().findLUSlength("aaa", "aaa"), equalTo(-1));
    }
}
