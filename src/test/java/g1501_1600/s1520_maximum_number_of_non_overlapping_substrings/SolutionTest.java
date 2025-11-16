package g1501_1600.s1520_maximum_number_of_non_overlapping_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNumOfSubstrings() {
        assertThat(
                new Solution().maxNumOfSubstrings("adefaddaccc"),
                equalTo(Arrays.asList("e", "f", "ccc")));
    }

    @Test
    void maxNumOfSubstrings2() {
        assertThat(
                new Solution().maxNumOfSubstrings("abbaccd"),
                equalTo(Arrays.asList("bb", "cc", "d")));
    }

    @Test
    void maxNumOfSubstrings3() {
        assertThat(new Solution().maxNumOfSubstrings("a"), equalTo(Arrays.asList("a")));
    }

    @Test
    void maxNumOfSubstrings4() {
        assertThat(new Solution().maxNumOfSubstrings("abc"), equalTo(Arrays.asList("a", "b", "c")));
    }

    @Test
    void maxNumOfSubstrings5() {
        assertThat(new Solution().maxNumOfSubstrings("abac"), equalTo(Arrays.asList("b", "c")));
    }

    @Test
    void maxNumOfSubstrings6() {
        assertThat(new Solution().maxNumOfSubstrings("bba"), equalTo(Arrays.asList("bb", "a")));
    }

    @Test
    void maxNumOfSubstrings7() {
        assertThat(new Solution().maxNumOfSubstrings("abcabc"), equalTo(Arrays.asList("abcabc")));
    }

    @Test
    void maxNumOfSubstrings8() {
        assertThat(new Solution().maxNumOfSubstrings("aaaa"), equalTo(Arrays.asList("aaaa")));
    }

    @Test
    void maxNumOfSubstrings9() {
        assertThat(new Solution().maxNumOfSubstrings(""), equalTo(Collections.emptyList()));
    }

    @Test
    void maxNumOfSubstrings10() {
        assertThat(
                new Solution().maxNumOfSubstrings("cabcccbaa"),
                equalTo(Arrays.asList("cabcccbaa")));
    }
}
