package g2501_2600.s2560_house_robber_iv;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minCapability() {
        assertThat(new Solution().minCapability(new int[] {2, 3, 5, 9}, 2), equalTo(5));
    }

    @Test
    void minCapability2() {
        assertThat(new Solution().minCapability(new int[] {2, 7, 9, 3, 1}, 2), equalTo(2));
    }
}
