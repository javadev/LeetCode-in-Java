package g0201_0300.s0213_house_robber_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void rob() {
        assertThat(new Solution().rob(new int[] {2, 3, 2}), equalTo(3));
    }

    @Test
    public void rob2() {
        assertThat(new Solution().rob(new int[] {1, 2, 3, 1}), equalTo(4));
    }

    @Test
    public void rob3() {
        assertThat(new Solution().rob(new int[] {1, 2, 3}), equalTo(3));
    }

    @Test
    public void rob4() {
        assertThat(new Solution().rob(new int[] {}), equalTo(0));
        assertThat(new Solution().rob(new int[] {1}), equalTo(1));
        assertThat(new Solution().rob(new int[] {1, 2}), equalTo(2));
    }
}
