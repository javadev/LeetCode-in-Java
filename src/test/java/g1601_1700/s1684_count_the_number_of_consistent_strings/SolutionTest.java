package g1601_1700.s1684_count_the_number_of_consistent_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countConsistentStrings() {
        assertThat(
                new Solution()
                        .countConsistentStrings(
                                "ab", new String[] {"ad", "bd", "aaab", "baa", "badab"}),
                equalTo(2));
    }

    @Test
    void countConsistentStrings2() {
        assertThat(
                new Solution()
                        .countConsistentStrings(
                                "abc", new String[] {"a", "b", "c", "ab", "ac", "bc", "abc"}),
                equalTo(7));
    }

    @Test
    void countConsistentStrings3() {
        assertThat(
                new Solution()
                        .countConsistentStrings(
                                "cad",
                                new String[] {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}),
                equalTo(4));
    }
}
