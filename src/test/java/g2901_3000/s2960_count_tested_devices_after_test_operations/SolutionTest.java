package g2901_3000.s2960_count_tested_devices_after_test_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTestedDevices() {
        assertThat(new Solution().countTestedDevices(new int[] {1, 1, 2, 1, 3}), equalTo(3));
    }

    @Test
    void countTestedDevices2() {
        assertThat(new Solution().countTestedDevices(new int[] {0, 1, 2}), equalTo(2));
    }
}
