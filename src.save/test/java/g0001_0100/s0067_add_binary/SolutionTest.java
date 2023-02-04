package g0001_0100.s0067_add_binary;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addBinary() {
        assertThat(new Solution().addBinary("11", "1"), equalTo("100"));
    }

    @Test
    void addBinary2() {
        assertThat(new Solution().addBinary("1010", "1011"), equalTo("10101"));
    }
}
