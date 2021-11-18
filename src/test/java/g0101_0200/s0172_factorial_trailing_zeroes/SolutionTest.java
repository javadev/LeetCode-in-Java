package g0101_0200.s0172_factorial_trailing_zeroes;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class SolutionTest {
	@Test
	public void trailingZeroes() {
       assertThat(Solution.trailingZeroes(3), equalTo(0));
    }
}
