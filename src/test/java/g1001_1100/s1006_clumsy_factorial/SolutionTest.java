package g1001_1100.s1006_clumsy_factorial;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void clumsy() {
        assertThat(new Solution().clumsy(4), equalTo(7));
    }

    @Test
    void clumsy2() {
        assertThat(new Solution().clumsy(10), equalTo(12));
    }
}
