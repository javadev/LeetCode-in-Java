package g1701_1800.s1745_palindrome_partitioning_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void checkPartitioning() {
        assertThat(new Solution().checkPartitioning("abcbdd"), equalTo(true));
    }

    @Test
    void checkPartitioning2() {
        assertThat(new Solution().checkPartitioning("bcbddxy"), equalTo(false));
    }
}
