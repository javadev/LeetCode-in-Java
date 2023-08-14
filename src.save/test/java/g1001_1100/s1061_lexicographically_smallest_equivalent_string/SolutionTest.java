package g1001_1100.s1061_lexicographically_smallest_equivalent_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestEquivalentString() {
        assertThat(
                new Solution().smallestEquivalentString("hello", "world", "hold"), equalTo("hdld"));
    }

    @Test
    void smallestEquivalentString2() {
        assertThat(
                new Solution().smallestEquivalentString("parker", "morris", "parser"),
                equalTo("makkek"));
    }

    @Test
    void smallestEquivalentString3() {
        assertThat(
                new Solution().smallestEquivalentString("leetcode", "programs", "sourcecode"),
                equalTo("aauaaaaada"));
    }
}
