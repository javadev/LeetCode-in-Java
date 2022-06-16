package g2201_2300.s2273_find_resultant_array_after_removing_anagrams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void removeAnagrams() {
        assertThat(new Solution().removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}), equalTo(Arrays.asList("abba","cd")));
    }

    @Test
    void removeAnagrams2() {
        assertThat(new Solution().removeAnagrams(new String[]{"a","b","c","d","e"}), equalTo(Arrays.asList("a","b","c","d","e")));
    }
}
