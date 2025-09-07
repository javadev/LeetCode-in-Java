package g3601_3700.s3677_count_binary_palindromic_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countBinaryPalindromes() {
        assertThat(new Solution().countBinaryPalindromes(9L), equalTo(6));
    }

    @Test
    void countBinaryPalindromes2() {
        assertThat(new Solution().countBinaryPalindromes(9L), equalTo(6));
    }
}
