package g2501_2600.s2551_put_marbles_in_bags;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void putMarbles() {
        assertThat(new Solution().putMarbles(new int[] {1, 3, 5, 1}, 2), equalTo(4L));
    }

    @Test
    void putMarbles2() {
        assertThat(new Solution().putMarbles(new int[] {1, 3}, 2), equalTo(0L));
    }
}
