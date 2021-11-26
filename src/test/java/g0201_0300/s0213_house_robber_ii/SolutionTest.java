package g0201_0300.s0213_house_robber_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void houseRobberII() {
        assertThat(new Solution().rob(new int[] {2, 3, 2}), equalTo(3));
    }
}
