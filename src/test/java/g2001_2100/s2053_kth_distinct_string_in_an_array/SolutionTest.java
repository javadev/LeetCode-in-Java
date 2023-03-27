package g2001_2100.s2053_kth_distinct_string_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthDistinct() {
        assertThat(
                new Solution().kthDistinct(new String[] {"d", "b", "c", "b", "c", "a"}, 2),
                equalTo("a"));
    }

    @Test
    void kthDistinct2() {
        assertThat(new Solution().kthDistinct(new String[] {"aaa", "aa", "a"}, 1), equalTo("aaa"));
    }

    @Test
    void kthDistinct3() {
        assertThat(new Solution().kthDistinct(new String[] {"a", "b", "a"}, 3), equalTo(""));
    }
}
