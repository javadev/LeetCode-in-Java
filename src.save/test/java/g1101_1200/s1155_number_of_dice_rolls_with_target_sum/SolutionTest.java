package g1101_1200.s1155_number_of_dice_rolls_with_target_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numRollsToTarget() {
        assertThat(new Solution().numRollsToTarget(1, 6, 3), equalTo(1));
    }

    @Test
    void numRollsToTarget2() {
        assertThat(new Solution().numRollsToTarget(2, 6, 7), equalTo(6));
    }

    @Test
    void numRollsToTarget3() {
        assertThat(new Solution().numRollsToTarget(30, 30, 500), equalTo(222616187));
    }
}
