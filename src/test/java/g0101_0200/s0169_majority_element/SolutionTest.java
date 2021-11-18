package g0101_0200.s0169_majority_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class SolutionTest {
	@Test
	public void majorityElement() {
		assertThat(new Solution().majorityElement(new int[] {3,2,3}), equalTo(3));
	}
}
