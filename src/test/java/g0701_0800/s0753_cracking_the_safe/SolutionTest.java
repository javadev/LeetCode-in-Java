package g0701_0800.s0753_cracking_the_safe;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void crackSafe() {
        assertThat(new Solution().crackSafe(1, 2), equalTo("01"));
    }

    @Test
    void crackSafe2() {
        assertThat(new Solution().crackSafe(2, 2), equalTo("00110"));
    }
}
