package g0401_0500.s0495_teemo_attacking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPoisonedDuration() {
        assertThat(new Solution().findPoisonedDuration(new int[] {1, 4}, 2), equalTo(4));
    }

    @Test
    void findPoisonedDuration2() {
        assertThat(new Solution().findPoisonedDuration(new int[] {1, 2}, 2), equalTo(3));
    }
}
