package g0101_0200.s0167_two_sum_ii_input_array_is_sorted;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class SolutionTest {
	@Test
	public void twoSum() {
		assertThat(new Solution().twoSum(new int[] { 2, 7, 11, 15 }, 9), equalTo(new int[] { 1, 2 }));
	}
}
