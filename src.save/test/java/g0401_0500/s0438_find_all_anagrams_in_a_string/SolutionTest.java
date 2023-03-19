package g0401_0500.s0438_find_all_anagrams_in_a_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findAnagrams() {
        assertThat(new Solution().findAnagrams("cbaebabacd", "abc"), equalTo(Arrays.asList(0, 6)));
    }

    @Test
    void findAnagrams2() {
        assertThat(new Solution().findAnagrams("abab", "ab"), equalTo(Arrays.asList(0, 1, 2)));
    }
}
