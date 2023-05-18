package g0901_1000.s0906_super_palindromes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void superpalindromesInRange() {
        assertThat(new Solution().superpalindromesInRange("4", "1000"), equalTo(4));
    }

    @Test
    void superpalindromesInRange2() {
        assertThat(new Solution().superpalindromesInRange("1", "2"), equalTo(1));
    }
}
