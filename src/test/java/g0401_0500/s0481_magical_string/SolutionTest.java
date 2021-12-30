package g0401_0500.s0481_magical_string;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {
    @Test
    void magicalString() {
        assertThat(new Solution().magicalString(6), equalTo(3));
    }

    @Test
    void magicalString2() {
        assertThat(new Solution().magicalString(1), equalTo(1));
    }
}
