package g2901_3000.s2981_find_longest_special_substring_that_occurs_thrice_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumLength() {
        assertThat(new Solution().maximumLength("aaaa"), equalTo(2));
    }

    @Test
    void maximumLength2() {
        assertThat(new Solution().maximumLength("abcdef"), equalTo(-1));
    }

    @Test
    void maximumLength3() {
        assertThat(new Solution().maximumLength("abcaba"), equalTo(1));
    }
}
