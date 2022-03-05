package g1101_1200.s1170_compare_strings_by_frequency_of_the_smallest_character;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numSmallerByFrequency() {
        assertThat(
                new Solution().numSmallerByFrequency(new String[] {"cbd"}, new String[] {"zaaaz"}),
                equalTo(new int[] {1}));
    }

    @Test
    void numSmallerByFrequency2() {
        assertThat(
                new Solution()
                        .numSmallerByFrequency(
                                new String[] {"bbb", "cc"},
                                new String[] {"a", "aa", "aaa", "aaaa"}),
                equalTo(new int[] {1, 2}));
    }
}
