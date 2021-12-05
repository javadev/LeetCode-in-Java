package g0101_0200.s0132_palindrome_partitioning_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void minCut() {
        assertThat(new Solution().minCut("aab"), equalTo(1));
    }
}
