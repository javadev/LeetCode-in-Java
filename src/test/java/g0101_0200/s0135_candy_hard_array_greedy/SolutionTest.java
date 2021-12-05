package g0101_0200.s0135_candy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void candy() {
        assertThat(new Solution().candy(new int[] {1, 0, 2}), equalTo(5));
    }
}
