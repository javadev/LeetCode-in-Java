package g1501_1600.s1520_maximum_number_of_non_overlapping_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
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
}
