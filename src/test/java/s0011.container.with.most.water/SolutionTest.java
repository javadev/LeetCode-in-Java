package s0011.container.with.most.water;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void maxArea() {
        assertThat(new Solution().maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}), equalTo(49));
    }
}
