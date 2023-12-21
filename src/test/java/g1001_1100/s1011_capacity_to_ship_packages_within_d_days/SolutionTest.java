package g1001_1100.s1011_capacity_to_ship_packages_within_d_days;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void shipWithinDays() {
        assertThat(
                new Solution().shipWithinDays(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5),
                equalTo(15));
    }

    @Test
    void shipWithinDays2() {
        assertThat(new Solution().shipWithinDays(new int[] {3, 2, 2, 4, 1, 4}, 3), equalTo(6));
    }
}
