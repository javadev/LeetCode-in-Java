package g0501_0600.s0594_longest_harmonious_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findLHS() {
        assertThat(new Solution().findLHS(new int[] {1, 3, 2, 2, 5, 2, 3, 7}), equalTo(5));
    }
}
