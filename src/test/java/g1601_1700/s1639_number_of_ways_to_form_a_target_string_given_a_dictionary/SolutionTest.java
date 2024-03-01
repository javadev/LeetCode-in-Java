package g1601_1700.s1639_number_of_ways_to_form_a_target_string_given_a_dictionary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numWays() {
        assertThat(
                new Solution().numWays(new String[] {"acca", "bbbb", "caca"}, "aba"), equalTo(6));
    }

    @Test
    void numWays2() {
        assertThat(new Solution().numWays(new String[] {"abba", "baab"}, "bab"), equalTo(4));
    }
}
