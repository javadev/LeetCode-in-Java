package g1601_1700.s1662_check_if_two_string_arrays_are_equivalent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arrayStringsAreEqual() {
        assertThat(
                new Solution()
                        .arrayStringsAreEqual(new String[] {"ab", "c"}, new String[] {"a", "bc"}),
                equalTo(true));
    }

    @Test
    void arrayStringsAreEqual2() {
        assertThat(
                new Solution()
                        .arrayStringsAreEqual(new String[] {"a", "cb"}, new String[] {"ab", "c"}),
                equalTo(false));
    }

    @Test
    void arrayStringsAreEqual3() {
        assertThat(
                new Solution()
                        .arrayStringsAreEqual(
                                new String[] {"abc", "d", "defg"}, new String[] {"abcddefg"}),
                equalTo(true));
    }
}
