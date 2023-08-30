package g2601_2700.s2609_find_the_longest_balanced_substring_of_a_binary_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findTheLongestBalancedSubstring() {
        assertThat(new Solution().findTheLongestBalancedSubstring("01000111"), equalTo(6));
    }

    @Test
    void findTheLongestBalancedSubstring2() {
        assertThat(new Solution().findTheLongestBalancedSubstring("00111"), equalTo(4));
    }

    @Test
    void findTheLongestBalancedSubstring3() {
        assertThat(new Solution().findTheLongestBalancedSubstring("111"), equalTo(0));
    }
}
