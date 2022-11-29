package g0401_0500.s0474_ones_and_zeroes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxForm() {
        assertThat(
                new Solution().findMaxForm(new String[] {"10", "0001", "111001", "1", "0"}, 5, 3),
                equalTo(4));
    }

    @Test
    void findMaxForm2() {
        assertThat(new Solution().findMaxForm(new String[] {"10", "0", "1"}, 1, 1), equalTo(2));
    }
}
