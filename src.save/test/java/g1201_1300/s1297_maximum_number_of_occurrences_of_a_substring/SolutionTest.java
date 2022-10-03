package g1201_1300.s1297_maximum_number_of_occurrences_of_a_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFreq() {
        assertThat(new Solution().maxFreq("aababcaab", 2, 3, 4), equalTo(2));
    }

    @Test
    void maxFreq2() {
        assertThat(new Solution().maxFreq("aaaa", 1, 3, 3), equalTo(2));
    }
}
