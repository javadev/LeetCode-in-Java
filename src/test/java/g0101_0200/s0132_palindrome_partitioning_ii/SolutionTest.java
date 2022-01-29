package g0101_0200.s0132_palindrome_partitioning_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCut() {
        assertThat(new Solution().minCut("aab"), equalTo(1));
    }
}
