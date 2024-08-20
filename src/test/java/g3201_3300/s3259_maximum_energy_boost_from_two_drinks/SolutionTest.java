package g3201_3300.s3259_maximum_energy_boost_from_two_drinks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxEnergyBoost() {
        assertThat(
                new Solution().maxEnergyBoost(new int[] {1, 3, 1}, new int[] {3, 1, 1}),
                equalTo(5L));
    }

    @Test
    void maxEnergyBoost2() {
        assertThat(
                new Solution().maxEnergyBoost(new int[] {4, 1, 1}, new int[] {1, 1, 3}),
                equalTo(7L));
    }
}
