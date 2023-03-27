package g2401_2500.s2472_maximum_number_of_non_overlapping_palindrome_substrings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPalindromes() {
        assertThat(new Solution().maxPalindromes("abaccdbbd", 3), equalTo(2));
    }

    @Test
    void maxPalindromes2() {
        assertThat(new Solution().maxPalindromes("adbcda", 2), equalTo(0));
    }
}
