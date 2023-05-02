package g2401_2500.s2484_count_palindromic_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPalindromes() {
        assertThat(new Solution().countPalindromes("103301"), equalTo(2));
    }

    @Test
    void countPalindromes2() {
        assertThat(new Solution().countPalindromes("0000000"), equalTo(21));
    }

    @Test
    void countPalindromes3() {
        assertThat(new Solution().countPalindromes("9999900000"), equalTo(2));
    }
}
