package g1801_1900.s1876_substrings_of_size_three_with_distinct_characters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodSubstrings() {
        assertThat(new Solution().countGoodSubstrings("xyzzaz"), equalTo(1));
    }

    @Test
    void countGoodSubstrings2() {
        assertThat(new Solution().countGoodSubstrings("aababcabc"), equalTo(4));
    }
}
