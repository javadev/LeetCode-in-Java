package g0501_0600.s0537_complex_number_multiplication;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void complexNumberMultiply() {
        assertThat(new Solution().complexNumberMultiply("1+1i", "1+1i"), equalTo("0+2i"));
    }

    @Test
    void complexNumberMultiply2() {
        assertThat(new Solution().complexNumberMultiply("1+-1i", "1+-1i"), equalTo("0+-2i"));
    }
}
