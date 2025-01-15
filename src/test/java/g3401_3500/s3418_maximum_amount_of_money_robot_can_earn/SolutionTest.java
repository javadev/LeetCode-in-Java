package g3401_3500.s3418_maximum_amount_of_money_robot_can_earn;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumAmount() {
        assertThat(
                new Solution().maximumAmount(new int[][] {{0, 1, -1}, {1, -2, 3}, {2, -3, 4}}),
                equalTo(8));
    }

    @Test
    void maximumAmount2() {
        assertThat(
                new Solution().maximumAmount(new int[][] {{10, 10, 10}, {10, 10, 10}}),
                equalTo(40));
    }
}
