package g2901_3000.s2953_count_complete_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countCompleteSubstrings() {
        assertThat(new Solution().countCompleteSubstrings("igigee", 2), equalTo(3));
    }

    @Test
    void countCompleteSubstrings2() {
        assertThat(new Solution().countCompleteSubstrings("aaabbbccc", 3), equalTo(6));
    }
}
