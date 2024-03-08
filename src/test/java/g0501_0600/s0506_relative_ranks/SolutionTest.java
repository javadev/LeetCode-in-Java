package g0501_0600.s0506_relative_ranks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRelativeRanks() {
        assertThat(
                new Solution().findRelativeRanks(new int[] {5, 4, 3, 2, 1}),
                equalTo(new String[] {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}));
    }

    @Test
    void findRelativeRanks2() {
        assertThat(
                new Solution().findRelativeRanks(new int[] {10, 3, 8, 9, 4}),
                equalTo(new String[] {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"}));
    }
}
