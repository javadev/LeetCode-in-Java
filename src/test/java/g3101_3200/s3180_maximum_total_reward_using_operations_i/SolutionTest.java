package g3101_3200.s3180_maximum_total_reward_using_operations_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTotalReward() {
        assertThat(new Solution().maxTotalReward(new int[] {1, 1, 3, 3}), equalTo(4));
    }

    @Test
    void maxTotalReward2() {
        assertThat(new Solution().maxTotalReward(new int[] {1, 6, 4, 3, 2}), equalTo(11));
    }
}
