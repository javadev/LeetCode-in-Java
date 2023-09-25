package g2501_2600.s2594_minimum_time_to_repair_cars;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void repairCars() {
        assertThat(new Solution().repairCars(new int[] {4, 2, 3, 1}, 10), equalTo(16L));
    }

    @Test
    void repairCars2() {
        assertThat(new Solution().repairCars(new int[] {5, 1, 8}, 6), equalTo(16L));
    }
}
