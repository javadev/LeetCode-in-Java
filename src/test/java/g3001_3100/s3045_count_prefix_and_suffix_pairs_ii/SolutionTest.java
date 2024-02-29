package g3001_3100.s3045_count_prefix_and_suffix_pairs_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPrefixSuffixPairs() {
        assertThat(
                new Solution().countPrefixSuffixPairs(new String[] {"a", "aba", "ababa", "aa"}),
                equalTo(4L));
    }

    @Test
    void countPrefixSuffixPairs2() {
        assertThat(
                new Solution().countPrefixSuffixPairs(new String[] {"pa", "papa", "ma", "mama"}),
                equalTo(2L));
    }

    @Test
    void countPrefixSuffixPairs3() {
        assertThat(new Solution().countPrefixSuffixPairs(new String[] {"abab", "ab"}), equalTo(0L));
    }
}
