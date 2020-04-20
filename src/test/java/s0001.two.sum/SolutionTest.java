package s0001.two.sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void twoSum() {
        assertThat(java.util.Arrays.toString(new Solution().twoSum(new int[] {2, 7, 11, 15}, 9)), equalTo("[0, 1]"));
    }
}
