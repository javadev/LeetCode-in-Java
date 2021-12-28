package g0401_0500.s0475_heaters;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findRadius() {
        assertThat(new Solution().findRadius(new int[] {1, 2, 3}, new int[] {2}), equalTo(1));
    }

    @Test
    void findRadius2() {
        assertThat(new Solution().findRadius(new int[] {1, 2, 3, 4}, new int[] {1, 4}), equalTo(1));
    }

    @Test
    void findRadius3() {
        assertThat(new Solution().findRadius(new int[] {1, 5}, new int[] {2}), equalTo(3));
    }
}
