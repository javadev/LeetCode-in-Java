package g3201_3300.s3298_count_substrings_that_can_be_rearranged_to_contain_a_string_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void validSubstringCount() {
        assertThat(new Solution().validSubstringCount("bcca", "abc"), equalTo(1L));
    }

    @Test
    void validSubstringCount2() {
        assertThat(new Solution().validSubstringCount("abcabc", "abc"), equalTo(10L));
    }

    @Test
    void validSubstringCount3() {
        assertThat(new Solution().validSubstringCount("abcabc", "aaabc"), equalTo(0L));
    }
}
