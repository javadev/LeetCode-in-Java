package g0201_0300.s0258_add_digits_easy_math_simulation_number_theory;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void addDigits() {
        assertThat(new Solution().addDigits(38), equalTo(2));
    }

    @Test
    public void addDigits2() {
        assertThat(new Solution().addDigits(0), equalTo(0));
    }
}
