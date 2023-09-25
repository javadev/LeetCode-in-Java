package g2501_2600.s2506_count_pairs_of_similar_strings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void similarPairs() {
        assertThat(
                new Solution().similarPairs(new String[] {"aba", "aabb", "abcd", "bac", "aabc"}),
                equalTo(2));
    }

    @Test
    void similarPairs2() {
        assertThat(new Solution().similarPairs(new String[] {"aabb", "ab", "ba"}), equalTo(3));
    }

    @Test
    void similarPairs3() {
        assertThat(new Solution().similarPairs(new String[] {"nba", "cba", "dba"}), equalTo(0));
    }
}
