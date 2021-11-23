package g0201_0300.s0241_different_ways_to_add_parentheses;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void diffWaysToCompute() {
        assertThat(new Solution().diffWaysToCompute("2-1-1"), equalTo(Arrays.asList(2, 0)));
    }

    @Test
    public void diffWaysToCompute2() {
        assertThat(
                new Solution().diffWaysToCompute("2*3-4*5"),
                equalTo(Arrays.asList(-34, -10, -14, -10, 10)));
    }
}
