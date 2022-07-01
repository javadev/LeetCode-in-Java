package g0701_0800.s0712_minimum_ascii_delete_sum_for_two_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDeleteSum() {
        assertThat(new Solution().minimumDeleteSum("sea", "eat"), equalTo(231));
    }

    @Test
    void minimumDeleteSum2() {
        assertThat(new Solution().minimumDeleteSum("delete", "leet"), equalTo(403));
    }
}
