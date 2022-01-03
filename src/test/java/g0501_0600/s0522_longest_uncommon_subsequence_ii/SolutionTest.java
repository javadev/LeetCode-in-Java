package g0501_0600.s0522_longest_uncommon_subsequence_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLUSlength() {
        assertThat(new Solution().findLUSlength(new String[] {"aba", "cdc", "eae"}), equalTo(3));
    }

    @Test
    void findLUSlength2() {
        assertThat(new Solution().findLUSlength(new String[] {"aaa", "aaa", "aa"}), equalTo(-1));
    }
}
