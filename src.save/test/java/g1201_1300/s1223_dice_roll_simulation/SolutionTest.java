package g1201_1300.s1223_dice_roll_simulation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void dieSimulator() {
        assertThat(new Solution().dieSimulator(2, new int[] {1, 1, 2, 2, 2, 3}), equalTo(34));
    }

    @Test
    void dieSimulator2() {
        assertThat(new Solution().dieSimulator(2, new int[] {1, 1, 1, 1, 1, 1}), equalTo(30));
    }

    @Test
    void dieSimulator3() {
        assertThat(new Solution().dieSimulator(3, new int[] {1, 1, 1, 2, 2, 3}), equalTo(181));
    }
}
