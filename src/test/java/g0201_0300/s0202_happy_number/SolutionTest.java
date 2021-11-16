package g0201_0300.s0202_happy_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void isHappy() {
        assertThat(new Solution().isHappy(19), equalTo(true));
    }
}
