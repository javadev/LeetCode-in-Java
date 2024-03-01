package g1701_1800.s1781_sum_of_beauty_of_all_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void beautySum() {
        assertThat(new Solution().beautySum("aabcb"), equalTo(5));
    }

    @Test
    void beautySum2() {
        assertThat(new Solution().beautySum("aabcbaa"), equalTo(17));
    }
}
