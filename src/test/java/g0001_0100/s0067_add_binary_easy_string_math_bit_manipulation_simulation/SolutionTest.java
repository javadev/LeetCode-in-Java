package g0001_0100.s0067_add_binary_easy_string_math_bit_manipulation_simulation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void addBinary() {
        assertThat(new Solution().addBinary("11", "1"), equalTo("100"));
    }
}
