package g2501_2600.s2514_count_anagrams;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countAnagrams() {
        assertThat(new Solution().countAnagrams("too hot"), equalTo(18));
    }

    @Test
    void countAnagrams2() {
        assertThat(new Solution().countAnagrams("aa"), equalTo(1));
    }
}
