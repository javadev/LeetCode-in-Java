package g1301_1400.s1323_maximum_69_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximum69Number() {
        assertThat(new Solution().maximum69Number(9996), equalTo(9999));
    }

    @Test
    void maximum69Number2() {
        assertThat(new Solution().maximum69Number(9999), equalTo(9999));
    }
}
