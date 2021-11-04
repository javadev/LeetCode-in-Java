package s0065_valid_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void validNumber() {
        assertThat(new Solution().isNumber("0"), equalTo(true));
    }
}
