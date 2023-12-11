package g1701_1800.s1710_maximum_units_on_a_truck;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumUnits() {
        assertThat(
                new Solution().maximumUnits(new int[][] {{1, 3}, {2, 2}, {3, 1}}, 4), equalTo(8));
    }

    @Test
    void maximumUnits2() {
        assertThat(
                new Solution().maximumUnits(new int[][] {{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10),
                equalTo(91));
    }
}
