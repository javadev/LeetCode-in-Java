package g1901_2000.s1910_remove_all_occurrences_of_a_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeOccurrences() {
        assertThat(new Solution().removeOccurrences("daabcbaabcbc", "abc"), equalTo("dab"));
    }

    @Test
    void removeOccurrences2() {
        assertThat(new Solution().removeOccurrences("axxxxyyyyb", "xy"), equalTo("ab"));
    }
}
