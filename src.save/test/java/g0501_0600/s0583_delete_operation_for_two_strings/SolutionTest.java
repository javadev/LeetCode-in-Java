package g0501_0600.s0583_delete_operation_for_two_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDistance() {
        assertThat(new Solution().minDistance("sea", "eat"), equalTo(2));
    }

    @Test
    void minDistance2() {
        assertThat(new Solution().minDistance("leetcode", "etco"), equalTo(4));
    }
}
