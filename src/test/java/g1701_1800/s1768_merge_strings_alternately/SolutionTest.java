package g1701_1800.s1768_merge_strings_alternately;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeAlternately() {
        assertThat(new Solution().mergeAlternately("abc", "pqr"), equalTo("apbqcr"));
    }

    @Test
    void mergeAlternately2() {
        assertThat(new Solution().mergeAlternately("ab", "pqrs"), equalTo("apbqrs"));
    }

    @Test
    void mergeAlternately3() {
        assertThat(new Solution().mergeAlternately("abcd", "pq"), equalTo("apbqcd"));
    }
}
